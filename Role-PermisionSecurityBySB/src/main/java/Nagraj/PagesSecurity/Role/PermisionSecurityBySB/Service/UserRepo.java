package Nagraj.PagesSecurity.Role.PermisionSecurityBySB.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import Nagraj.PagesSecurity.Role.PermisionSecurityBySB.Model.User;

public interface UserRepo  extends JpaRepository<User, Integer>{

	User findUserByUsername(String username);
      
}
