/**
 * 
 */
package com.UserPannel.domain.security;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.UserPannel.domain.User;

/**
 * @author deepasapkota
 * 
 * This is also to persist our class to database by thse time we start our application
 * 
 *
 */



@Entity
@Table(name="user_role") //@table specify table name that will be created in table.
public class UserRole {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long userRoleId;	 
	 
/**
	 * @param user
	 * @param role
	 */
	public UserRole(User user, Role role) {
		super();
		
		this.user = user;
		this.role = role;
	}


	    @ManyToOne(fetch = FetchType.EAGER) //FetchType is to say class will actively fetch whenever this class is instantiated
	    @JoinColumn(name = "user_id")
	    private User user;


	    @ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "role_id")
	    private Role role;

	    public UserRole() {}

	    public long getUserRoleId() {
	        return userRoleId;
	    }

	    public void setUserRoleId(long userRoleId) {
	        this.userRoleId = userRoleId;
	    }

	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }

	    public Role getRole() {
	        return role;
	    }

	    public void setRole(Role role) {
	        this.role = role;
	    }
	
	

}
