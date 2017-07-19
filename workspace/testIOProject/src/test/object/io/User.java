package test.object.io;

public class User implements java.io.Serializable {
private String userid;
private String userPwd;
private String userName;

public User() {
	super();
}

public User(String userid, String userPwd, String userName) {
	super();
	this.userid = userid;
	this.userPwd = userPwd;
	this.userName = userName;
}

public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
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
public String toString(){
	return this.userid + "\t" + this.userPwd +"\t"+ this.userName;
}

}
