/**
 * 
 */
package com.UserPannel.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.UserPannel.domain.PrimaryTransaction;

/**
 * @author deepasapkota
 *
 */
public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
