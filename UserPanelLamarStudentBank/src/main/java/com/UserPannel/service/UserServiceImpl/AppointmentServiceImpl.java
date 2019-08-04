/**
 * 
 */
package com.UserPannel.service.UserServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserPannel.dao.AppointmentDao;
import com.UserPannel.domain.Appointment;
import com.UserPannel.service.AppointmentService;

/**
 * @author deepasapkota
 *
 */

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentDao appointmentDao;

	public Appointment createAppointment(Appointment appointment) {
		return appointmentDao.save(appointment);
	}

	public List<Appointment> findAll() {
		return appointmentDao.findAll();
	}

	public Appointment findAppointment(Long id) {
		return appointmentDao.findById(id).orElse(null); //changed
	}

	public void confirmAppointment(Long id) {
		Appointment appointment = findAppointment(id);
		appointment.setConfirmed(true);
		appointmentDao.save(appointment);
	}
}
