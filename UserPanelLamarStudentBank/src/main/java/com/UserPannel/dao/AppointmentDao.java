/**
 * 
 */
package com.UserPannel.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.UserPannel.domain.Appointment;

/**
 * @author deepasapkota
 *
 */
public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}
