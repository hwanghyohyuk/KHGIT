package test.map;

import java.io.Serializable;

public class User implements Serializable{
	private  String userId;
	private String userPwd;
	private String userName;
	
	public User() {
		super();
	}
	
	public User(String userid, String userPwd, String userName) {
		super();
		this.userId = userid;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public String getUserid() {
		return userId;
	}
	
	public void setUserid(String userid) {
		this.userId = userid;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.userId + "\t" +this.userPwd + "\t" +this.userName; 
	}
}
