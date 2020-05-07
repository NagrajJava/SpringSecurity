package Nagraj.PagesSecurity.Role.PermisionSecurityBySB.SecurityConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
 
 @Configuration
 @EnableWebSecurity
public class PagesConfig extends WebSecurityConfigurerAdapter
{
	/*
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception { auth .inMemoryAuthentication()
	 * .withUser("manager").password(passwordEncoder().encode("1234")).roles(
	 * "Manager") .and()
	 * .withUser("admin").password(passwordEncoder().encode("1234")).roles("Admin")
	 * .and()
	 * .withUser("user").password(passwordEncoder().encode("1234")).roles("User").
	 * authorities("Access-user"); }
	 */
	
	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public AuthenticationProvider authentication()
	{
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		      provider.setUserDetailsService(userDetailsService);
		      //provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		       provider.setPasswordEncoder(new BCryptPasswordEncoder());
		return provider;
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/index.html").permitAll()
		.antMatchers("/profile/**").authenticated()
		.antMatchers("/admin/**").hasAnyRole("Admin","Manager")
		.antMatchers("/management/**").hasAnyRole("Manager","Admin","User")
		.antMatchers("/public/api/test1").hasAuthority("Access-user")
		.and()
		.formLogin()
		.loginPage("/login").permitAll()
		.and()
		 .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login")
		 .and()
		 .rememberMe().tokenValiditySeconds(2923000).key("mysecret");
		
	}
	
	/*
	 * @Bean PasswordEncoder passwordEncoder() { return new BCryptPasswordEncoder();
	 * 
	 * }
	 */
	 
}
