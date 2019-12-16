package test;

public class Iciamember {

	String name;
	int age;
	String gender;
	
	
	Iciamember(String name,int age,String gender){
	this.name=name;
	this.age=age;
	this.gender=gender;
	}


	@Override
	public String toString() {
		return "Iciamember [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}	
}
