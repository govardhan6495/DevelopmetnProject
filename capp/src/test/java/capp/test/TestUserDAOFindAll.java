package capp.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import capp.config.SpringRootConfig;
import capp.dao.UserDAO;
import capp.model.User;

public class TestUserDAOFindAll {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		
		UserDAO userDAO = ctx.getBean(UserDAO.class);
		
		List<User> users = userDAO.findAll();
		
		for(User u : users) {
			
			System.out.println(u.getUserId() + " "+
								u.getName()+ " "+
								u.getRole()+ " ");
		}
	}

}
