/**
 * 
 */
package com.UserPannel.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.UserPannel.domain.SavingsTransaction;

/**
 * @author deepasapkota
 *
 */
public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}
