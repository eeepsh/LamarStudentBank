/**
 * 
 */
package com.UserPannel.service.UserServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.UserPannel.dao.UserDao;
import com.UserPannel.domain.User;

/**
 * @author deepasapkota
 * 
 * UserDetailService is a core interface which loads user-specific data
 * It is used throughout the framework as a user DAO and the strategy used by the DaoAuthenticationProvider
 *
 */

@Service
public class UserSecurityService implements UserDetailsService{

	 /** The application logger */
    private static final Logger LOG = LoggerFactory.getLogger(UserSecurityService.class);

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUsername(username);
        if (null == user) {
            LOG.warn("Username {} not found", username);
            throw new UsernameNotFoundException("Username " + username + " not found");
        }
        return user;
    }

}
