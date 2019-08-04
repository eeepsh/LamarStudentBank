package com.UserPannel.dao;

import org.springframework.data.repository.CrudRepository;

import com.UserPannel.domain.SavingsAccount;

public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long>{
	
	SavingsAccount findByAccountNumber(int accountNumber);

}
