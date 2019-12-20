package test;

public class Grade {
//	학생번호 이름 생년월일 주소 전화번호 자바점수 서블렛점수 스프링 점수
private int studentNumber;
private String name;
private String birth;
private String address;
private int phoneNumber;
private int javaScore;
private int servletScore;
private int springScore;

public Grade() {
	
}

@Override
public String toString() {
	return "Grade [studentNumber=" + studentNumber + ", name=" + name + ", birth=" + birth + ", address=" + address
			+ ", phoneNumber=" + phoneNumber + ", javaScore=" + javaScore + ", servletScore=" + servletScore
			+ ", springScore=" + springScore + "]";
}

public Grade(int studentNumber,String name,String birth,String address,int phoneNumber
		,int javaScore,int servletScore,int springScore) {
	this.studentNumber=studentNumber;
	this.name=name;
	this.birth=birth;
	this.address=address;
	this.phoneNumber=phoneNumber;
	this.javaScore=javaScore;
	this.servletScore=servletScore;
	this.springScore=springScore;	
	
}

public int getStudentNumber() {
	return studentNumber;
}

public void setStudentNumber(int studentNumber) {
	this.studentNumber = studentNumber;
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

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public int getJavaScore() {
	return javaScore;
}

public void setJavaScore(int javaScore) {
	this.javaScore = javaScore;
}

public int getServletScore() {
	return servletScore;
}

public void setServletScore(int servletScore) {
	this.servletScore = servletScore;
}

public int getSpringScore() {
	return springScore;
}

public void setSpringScore(int springScore) {
	this.springScore = springScore;
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
