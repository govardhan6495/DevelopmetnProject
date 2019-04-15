package capp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import capp.config.SpringRootConfig;
import capp.model.User;
import capp.service.UserService;

public class TestUserServiceRegister {

	public static void main(String[] args) {
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        
		UserService userService=ctx.getBean(UserService.class);
        //TODO: the user details will be taken from User-Reg-Form
        User u=new User();
        u.setName("Lokesh");
        u.setPhone("9988776655");
        u.setEmail("lokesh@gmail.com");
        u.setAddress("Amaravathi");
        u.setLoginName("Lokesh");
        u.setPassword("lokesh");
        u.setRole(UserService.ROLE_ADMIN);
        u.setLoginStatus(UserService.LOGIN_STATUS_ACTIVE);
        userService.register(u);
        System.out.println("--------User Registered Successfully------");

	}

}
