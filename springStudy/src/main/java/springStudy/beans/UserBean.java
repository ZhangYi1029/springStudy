package springStudy.beans;

import java.io.Serializable;
/**
 * 
 * @author ZhangYi
 *
 */
public class UserBean implements Serializable{
	private int id ;
	private String name;
	private String pwd;
	
	
	
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UserBean(int id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPwd() {
		return pwd;
	}



	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
	
}
