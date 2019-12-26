package test;

public class Student extends People {
	int studentNumber;
String 	department;

public Student() {
	
}

public Student(String name,
	String securityNumber,int studentNumber,
String department) {
//	this.name=name;
//	this.securityNumber=securityNumber;
	super(name,securityNumber); //부모클래스의  생성자 이거쓰면 일일이 디스안써도됨(부모클래스것만)
	this.studentNumber=studentNumber;
	this.department=department;
}


@Override
public String toString() {
	return "Student [studentNumber=" + studentNumber + ", department=" + department + ", name=" + name
			+ ", securityNumber=" + securityNumber + "]";
}

}
