package com.UserPannel.dao;

import java.util.List;

//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.repository.CrudRepository;

import com.UserPannel.domain.User;
// CrudRepository provides sophisticated CRUD functionality for entity class that is being managed

public interface UserDao extends CrudRepository<User, Long> {
	
	
	//when spring boot see this find by then it will assume that we have username in our user class in domain
	User findByUsername(String username);
	User findByEmail(String email);
	List<User> findAll();
	

}
