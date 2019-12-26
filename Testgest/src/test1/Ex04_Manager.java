package test1;

public class Ex04_Manager extends Ex04_Employee{
	int bonus;

	public Ex04_Manager(int bonus) {
		super();
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Ex04_Manager [bonus=" + bonus + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	
}
