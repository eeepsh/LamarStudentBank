/**
 * 
 */
package com.UserPannel.dao;

import org.springframework.data.repository.CrudRepository;

import com.UserPannel.domain.PrimaryAccount;

/**
 * @author deepasapkota
 *
 */
public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount, Long> {
	PrimaryAccount findByAccountNumber( int accountNumber);
	

}
