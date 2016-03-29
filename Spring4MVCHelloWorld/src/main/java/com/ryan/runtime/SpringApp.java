package com.ryan.runtime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ryan.model.User;
import com.ryan.user.UserService;

public class SpringApp {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("SpringBeans.xml");

		UserService userService = (UserService)appContext.getBean("userService");
		/** insert **/
		User user = new User();
		user.setUserId(7668);
		user.setEmulationId("HAIO");
		user.setLoginId("1234");
		userService.addUser(user);
//
//		/** select **/
//		Stock stock2 = stockBo.findByStockCode("7668");
//		System.out.println(stock2);
//
//		/** update **/
//		stock2.setStockName("HAIO-1");
//		stockBo.update(stock2);
//
//		/** delete **/
//		stockBo.delete(stock2);
//
//		System.out.println("Done");
	}
}
