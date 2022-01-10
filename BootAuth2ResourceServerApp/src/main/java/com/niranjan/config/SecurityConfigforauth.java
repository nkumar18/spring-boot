package com.niranjan.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*
 * Finally we will be configuring security.
 *  In this configuration we specify which urls are to be intercepted,
 *   and are to be accessed by which users and having which roles.
 * 
 * 
 */


@Configuration
@EnableWebSecurity
public class SecurityConfigforauth  extends WebSecurityConfigurerAdapter{
	
	/**
	 * Override this method to configure {@link WebSecurity}. For example, if you wish to
	 * ignore certain requests.
	 */
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**");
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(http);
		http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/getEmplist").hasAnyRole("admin").anyRequest().authenticated().and().formLogin().permitAll().and().logout().permitAll();
		http.csrf().disable();
		
	}
	
	
	 @Override
	    public void configure(AuthenticationManagerBuilder authenticationMgr) throws Exception {
	        authenticationMgr.inMemoryAuthentication().withUser("admin").password("admin")
	            .authorities("ROLE_ADMIN");
	    }
	
	
	
	
	
	

}
