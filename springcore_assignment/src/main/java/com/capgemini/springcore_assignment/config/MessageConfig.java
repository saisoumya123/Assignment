package com.capgemini.springcore_assignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore_assignment.beans.MessageBean;
import com.capgemini.springcore_assignment.beans.UserBean;

@Configuration
public class MessageConfig {

	@Bean
	public MessageBean getMessageBean() {
		
		MessageBean messageBean = new MessageBean();
		messageBean.setMessage("THIS IS PREVIOUS");;
		//messageBean.setUser(getUserBean1());
		
		return messageBean;
	}
	
	@Bean(name = "one")
	public  UserBean getUserBean() {
		UserBean userBean = new UserBean();
		userBean.setId(12);
		userBean.setName("my name is soumya");
		
		return userBean;
	}
	
	@Bean(name = "two")
	//@Primary
	public  UserBean getUserBean1() {
		UserBean userBean = new UserBean();
		userBean.setId(121);
		userBean.setName("my name is vandana");
		
		return userBean;
	}
	
}
