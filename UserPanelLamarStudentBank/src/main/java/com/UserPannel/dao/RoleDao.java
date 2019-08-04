/**
 * 
 */
package com.UserPannel.dao;

import org.springframework.data.repository.CrudRepository;

import com.UserPannel.domain.security.Role;

/**
 * @author deepasapkota
 *
 */

public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
