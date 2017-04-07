package springStudy.dao;

import springStudy.beans.UserBean;

public interface IUserBeanDao {

	public void saveUser(UserBean user);

	public void updateUser(UserBean user);

}
