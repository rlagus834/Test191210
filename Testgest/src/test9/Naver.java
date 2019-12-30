package test9;

public class Naver {


private String id;
private String password;
private String name;
public Naver(String id, String password, String name, String birth, String email, String phone, String joinday,String gender) {
	super();
	this.id = id;
	this.password = password;
	this.name = name;
	this.birth = birth;
	this.email = email;
	this.joinday=joinday;
	this.phone = phone;
	this.gender = gender;
}
public String getJoinday() {
	return joinday;
}
public void setJoinday(String joinday) {
	this.joinday = joinday;
}

@Override
public String toString() {
	return "Naver [id=" + id + ", password=" + password + ", name=" + name + ", birth=" + birth + ", email=" + email
			+ ", phone=" + phone + ", gender=" + gender + ", joinday=" + joinday + "]";
}

private String birth;
private String email;
private String phone;
private String gender;
private String joinday;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBirth() {
	return birth;
}
public void setBirth(String birth) {
	this.birth = birth;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
	
	
	
}
