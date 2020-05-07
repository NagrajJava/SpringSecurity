package Nagraj.PagesSecurity.Role.PermisionSecurityBySB.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import Nagraj.PagesSecurity.Role.PermisionSecurityBySB.Model.User;

@Service
public class securityserviceImpl implements UserDetailsService
{
	@Autowired
 	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repo.findUserByUsername(username);
		if(user == null)
		{
			System.out.println("user not found");
			throw new UsernameNotFoundException("User NOt FOUND");
			
		}
		return new Userprinciple(user);
	}

	/*
	 * @Override public UserDetails loadUserByUsername(String username) throws
	 * UsernameNotFoundException { User user = repo.findUserByUsername(Username);
	 * if(user == null) { throw new UsernameNotFoundException("USer NOT FOUND"); }
	 * return new Userprinciple(user);
	 * 
	 * }
	 */
	
	
	

}
