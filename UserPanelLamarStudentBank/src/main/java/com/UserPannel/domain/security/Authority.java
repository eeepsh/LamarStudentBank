/**
 * 
 */
package com.UserPannel.domain.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author deepasapkota
 *
 *this class implements grantedAuthority which represents an authority granted to an authentication object
 *We are defining an authority that which a string would represent authority content
 *we are overriding the method getAuthority to return authority string
 */

public class Authority implements GrantedAuthority{
	
	 private final String authority;

	    public Authority(String authority) {
	        this.authority = authority;
	    }

	    @Override
	    public String getAuthority() {
	        return authority;
	    }

}
