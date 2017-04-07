package springStudy.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springStudy.beans.UserBean;

public class UserBeanTest {

	private ApplicationContext ac;
	@Before
	public void before(){
		ac =new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
			
	}
	@Test
	public void testUserBean(){
		UserBean user =(UserBean) ac.getBean("user");
		System.out.println(user.getName()+"   "+user.getPwd());
		UserBean userTwo =(UserBean) ac.getBean("userTwo");
		System.out.println(userTwo.getName()+"   "+userTwo.getPwd());
		
	
	}
}
