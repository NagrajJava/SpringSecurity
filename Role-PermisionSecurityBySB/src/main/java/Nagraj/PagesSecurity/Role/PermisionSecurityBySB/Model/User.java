package Nagraj.PagesSecurity.Role.PermisionSecurityBySB.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User 
{
	@Id
	private int id;
	
	@Column(nullable = false)
    private	String username;
	
	@Column(nullable = false)
	private String Password;
	
	private String Roles;
	
    private	String Permission;
	
	private int Active;
	
	public User() {}
		

	

	public User(int id, String username, String password, String roles, String permission, int active) {
		super();
		this.id = id;
		this.username = username;
		Password = password;
		Roles = roles;
		Permission = permission;
		Active = 1;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getPassword() {
		return Password;
	}




	public void setPassword(String password) {
		Password = password;
	}




	public String getRoles() {
		return Roles;
	}




	public void setRoles(String roles) {
		Roles = roles;
	}




	public String getPermission() {
		return Permission;
	}




	public void setPermission(String permission) {
		Permission = permission;
	}




	public int getActive() {
		return Active;
	}




	public void setActive(int active) {
		Active = active;
	}




	public List<String> getRoleList(){
        if(this.Roles.length() > 0){
            return Arrays.asList(this.Roles.split(","));
        }
        return new ArrayList<>();
    }

    public List<String> getPermissionList(){
        if(this.Permission.length() > 0){
            return Arrays.asList(this.Permission.split(","));
        }
        return new ArrayList<>();
    }
   
}
