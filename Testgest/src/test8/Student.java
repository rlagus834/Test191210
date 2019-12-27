package test8;

import java.util.Scanner;

public class Student {

	int studentNo, age;
	String name,address,gender,phone;
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", age=" + age + ", name=" + name + ", address=" + address
				+ ", gender=" + gender + ", phone=" + phone + "]";
	}
	
	
	public Student() {
		
	}
	public Student(int studentNo, int age, String name, String address, String gender, String phone) {
		super();
		this.studentNo = studentNo;
		this.age = age;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.phone = phone;
	}
	
	
	
	
	
	
	
	
	
	
}
