package test;

import java.util.*;



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

List<Grade> list=new ArrayList<Grade>();

Scanner scan=new Scanner(System.in);
int javaMaxScore=0,serveltMaxScore=0,springMaxScore=0,countNumber=0;
boolean run=true;



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


public void createInput(){
	Grade gr=new Grade();
	countNumber++;
	gr.setStudentNumber(countNumber);			
	System.out.println("학생 정보를 입력하세요.");
	System.out.println("이름:");
	String nameInput=scan.next();
	gr.setName(nameInput);
	System.out.println("생년월일:");
	String birthInput=scan.next();
	gr.setBirth(birthInput);
	System.out.println("주소:");
	String addressInput=scan.next();
	gr.setAddress(addressInput);
	System.out.println("전화번호:");
	int phoneNumber=scan.nextInt();
	gr.setPhoneNumber(phoneNumber);
	list.add(gr);
	
	
	
	
	
}
	
public void gradeInput(){
	System.out.println("학생이름을 입력하세요");
	String nameInput=scan.next();
	for(int i=0;i<list.size();i++) {
		if(list.get(i).getName().equals(nameInput)) {
			System.out.println("java 점수:");
			int javaScore=scan.nextInt();
			list.get(i).setJavaScore(javaScore);
			System.out.println("servlet 점수:");
			int servletScore=scan.nextInt();
			list.get(i).setServletScore(servletScore);
			System.out.println("spring 점수:");
			int springScore=scan.nextInt();
			list.get(i).setSpringScore(springScore);
		}
	}
	
	
}
	
public void grade(){
	
	System.out.println(list.toString());
	
	
	
}
	
public void max(){
	
	System.out.println("과목을 선택하세요.");
	System.out.println("1.java | 2.servelt | 3.spring");
	int gradeChoiceInput=scan.nextInt();
	if(1==gradeChoiceInput) {
		for(int i=0;i<list.size();i++) {
			if(javaMaxScore<list.get(i).getJavaScore()) {
				javaMaxScore=list.get(i).getJavaScore();
				
			}
			
		}System.out.println(javaMaxScore);
	}
	else if(2==gradeChoiceInput) {
	for(int i=0;i<list.size();i++) {
		if(serveltMaxScore<list.get(i).getServletScore()) {
			serveltMaxScore=list.get(i).getServletScore();
		}
		
	}System.out.println(serveltMaxScore);
	}
	else if(3==gradeChoiceInput) {
	for(int i=0;i<list.size();i++) {
		if(springMaxScore<list.get(i).getSpringScore()) {
			springMaxScore=list.get(i).getSpringScore();
		}
		
	}System.out.println(springMaxScore);
	}else {
		System.out.println("잘못입력하셨습니다.");
	}
	
	
	
	
}


	
	
	
	
	
	
	
	
}