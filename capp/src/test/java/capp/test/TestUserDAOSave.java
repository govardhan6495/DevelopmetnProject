package capp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import capp.config.SpringRootConfig;
import capp.dao.UserDAO;
import capp.model.User;

public class TestUserDAOSave {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		
		UserDAO userDAO = ctx.getBean(UserDAO.class);
		
		User u = new User();
		
		u.setName("Zaheer");
        u.setPhone("9554433111");
        u.setEmail("zaheer12t@yahoo.com");
        u.setAddress("Jaipur");
        u.setLoginName("Zaheeer");
        u.setPassword("zaheer");
        u.setRole(1);//Admin Role 
        u.setLoginStatus(1); //Active
        userDAO.save(u);
        System.out.println("--------Data Saved------");
	}

}
