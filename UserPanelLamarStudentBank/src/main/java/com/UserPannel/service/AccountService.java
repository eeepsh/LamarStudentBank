/**
 * 
 */
package com.UserPannel.service;

import java.security.Principal;

import com.UserPannel.domain.PrimaryAccount;
import com.UserPannel.domain.PrimaryTransaction;
import com.UserPannel.domain.SavingsAccount;
import com.UserPannel.domain.SavingsTransaction;

/**
 * @author deepasapkota
 *
 */
public interface AccountService {
	
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
    

}
