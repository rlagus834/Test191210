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


//naver클래스에 기본생성자를 선언하여
//기본생성자를이용해 member1객체를 선언한뒤 모든 필드 값을 본인옆사람의 정보로지정해보세요
//이름 성별 전화번호 생년월일 직업

public String getpassword() {
	return password;
}
public void setpassword(String password) {
	this.password=password;
}


public Navermember() {
	
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
