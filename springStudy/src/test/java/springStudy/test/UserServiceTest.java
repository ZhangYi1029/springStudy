package springStudy.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springStudy.beans.UserBean;
import springStudy.service.IUserBeanService;

public class UserServiceTest {

	private ApplicationContext ac;

	@Before
	public void before(){
		
		ac=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		
	}
	@Test
	public void testUserService(){
		
	UserBean user =new UserBean(0,"Ð¡ºÚ","78965423");	
	UserBean userTwo =new UserBean(0,"Ð¡ºì", "789635563");
	IUserBeanService service=	(IUserBeanService) ac.getBean("service");
	
	service.saveUser(user);
	service.updateUser(userTwo);
	
	
	}
	
	
}
