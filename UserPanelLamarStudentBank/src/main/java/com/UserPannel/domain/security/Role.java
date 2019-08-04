/**
 * 
 */
package com.UserPannel.domain.security;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author deepasapkota
 * 
 * This Role class as an entity which will be persistant into our database 
 * it has role id, name and hashset of user roles
 * this is for defining Role as we have two roles one is admin and another is user
 *
 */

@Entity
public class Role {
	
    @Id
//  @GeneratedValue(strategy = GenerationType.AUTO)
  private int roleId;

  private String name;

  @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<UserRole> userRoles = new HashSet<>();

  public Role() {

  }

  public int getRoleId() {
      return roleId;
  }

  public void setRoleId(int roleId) {
      this.roleId = roleId;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public Set<UserRole> getUserRoles() {
      return userRoles;
  }

  public void setUserRoles(Set<UserRole> userRoles) {
      this.userRoles = userRoles;
  }


}
