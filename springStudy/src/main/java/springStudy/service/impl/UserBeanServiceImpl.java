package springStudy.service.impl;

import springStudy.beans.UserBean;
import springStudy.dao.IUserBeanDao;
import springStudy.service.IUserBeanService;

public class UserBeanServiceImpl implements IUserBeanService {

	private IUserBeanDao dao ;

	public void setDao(IUserBeanDao dao) {
		this.dao = dao;
	}

	public void saveUser(UserBean user) {
		// TODO Auto-generated method stub

	dao.saveUser(user);
	
	}

	public void updateUser(UserBean user) {
		// TODO Auto-generated method stub
	dao.updateUser(user);
	}

}
