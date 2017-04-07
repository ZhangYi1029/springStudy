package springStudy.dao.impl;

import springStudy.beans.UserBean;
import springStudy.dao.IUserBeanDao;

public class UserBeanDaoImpl implements IUserBeanDao {

	public void saveUser(UserBean user) {
		// TODO Auto-generated method stub

		System.out.println(user.getName()+"  "+user.getPwd());
		
	}

	public void updateUser(UserBean user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+"  "+user.getPwd());
	}

}
