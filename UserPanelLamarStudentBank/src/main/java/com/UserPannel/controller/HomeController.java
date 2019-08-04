/**
 * 
 */
package com.UserPannel.controller;

import java.security.Principal;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.UserPannel.dao.RoleDao;
import com.UserPannel.domain.PrimaryAccount;
import com.UserPannel.domain.SavingsAccount;
import com.UserPannel.domain.User;
import com.UserPannel.domain.security.UserRole;
import com.UserPannel.service.UserService;

/**
 * @author deepasapkota
 *
 */
@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	
	@Autowired
	private RoleDao roleDao;
	
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public String signup(Model model) {
	
		User user= new User();
		model.addAttribute("user", user);
		return "signup";
		
	}
	
	@RequestMapping(value = "signup", method =RequestMethod.POST)
	public String signupPost(@ModelAttribute("user") User user, Model model) {
		
		//invoking the user service that we have autowired 
		//checking whether user exist or not by passing usename and email
		
		if(userService.checkUserExists(user.getUsername(), user.getEmail())) {
			
			if(userService.checkEmailExists(user.getEmail())) {
				model.addAttribute("emailExists", true);
				
			}
			
			if(userService.checkUsernameExists(user.getUsername())) {
				model.addAttribute("usernameExists", true);
				
			
			}
			return "signup";
		}
		else {
			Set<UserRole> userRoles= new HashSet<>();
			userRoles.add(new UserRole(user, roleDao.findByName("ROLE_USER")));
			System.out.println("user_roles length" + userRoles.size());
			//userService.save(user);
			userService.createUser(user, userRoles);
			return "redirect:/";
		}
	}
	
	
	//defining tow
	
	@RequestMapping("/userFront")
	public String userFront(Principal principal, Model model) {
        User user = userService.findByUsername(principal.getName());
        PrimaryAccount primaryAccount = user.getPrimaryAccount();
        SavingsAccount savingsAccount = user.getSavingsAccount();

        model.addAttribute("primaryAccount", primaryAccount);
        model.addAttribute("savingsAccount", savingsAccount);

        return "userFront";
    }
	

}
