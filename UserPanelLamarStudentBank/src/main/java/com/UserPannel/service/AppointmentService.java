/**
 * 
 */
package com.UserPannel.service;

import java.util.List;

import com.UserPannel.domain.Appointment;

/**
 * @author deepasapkota
 *
 */
public interface AppointmentService {
	
	
	Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}
