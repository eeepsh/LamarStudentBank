/**
 * 
 */
package com.UserPannel.resource;

/**
 * @author deepasapkota
 *
 */



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.UserPannel.domain.PrimaryTransaction;
import com.UserPannel.domain.SavingsTransaction;
import com.UserPannel.domain.User;
import com.UserPannel.service.TransactionService;
import com.UserPannel.service.UserService;


@RestController //it is for rest API controller String will help to diserialize 
@RequestMapping("/api")
@PreAuthorize("hasRole('ADMIN')")
public class UserResource {
	




	@Autowired
	private UserService userService;

	@Autowired
	private TransactionService transactionService;

	@RequestMapping(value = "/user/all", method = RequestMethod.GET)
	public List<User> userList() {
		return userService.findUserList();
	}

	@RequestMapping(value = "/user/primary/transaction", method = RequestMethod.GET)
	public List<PrimaryTransaction> getPrimaryTransactionList(@RequestParam("username") String username) {
		return transactionService.findPrimaryTransactionList(username);
	}

	@RequestMapping(value = "/user/savings/transaction", method = RequestMethod.GET)
	public List<SavingsTransaction> getSavingsTransactionList(@RequestParam("username") String username) {
		return transactionService.findSavingsTransactionList(username);
	}

	@RequestMapping("/user/{username}/enable")
	public void enableUser(@PathVariable("username") String username) {
		userService.enableUser(username);
	}

	@RequestMapping("/user/{username}/disable")
	public void diableUser(@PathVariable("username") String username) {
		userService.disableUser(username);
	}

}



