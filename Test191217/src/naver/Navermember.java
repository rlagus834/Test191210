package naver;



public class Navermember {
private String id;
private String password;	
private String name;	
private String birth;
private String gender;
private String email; 
private String phone;	


public Navermember(String id, String password, String name, String birth, String gender, String email, String phone) {
	
	this.id = id;
	this.password = password;
	this.name = name;
	this.birth = birth;
	this.gender = gender;
	this.email = email;
	this.phone = phone;
	
	
	
}

//id 필드값을 저장하고 가져오고 싶을때
//getter메소드= 값출력,setter 메소드= 세팅하는  값을 대입하는 메소드
public String getId() {
	return id;
}
public void setId(String id) {
	this.id=id;
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

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
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

@Override
public String toString() {
	return "Navermember [id=" + id + ", password=" + password + ", name=" + name + ", birth=" + birth + ", gender="
			+ gender + ", email=" + email + ", phone=" + phone + "]";
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
