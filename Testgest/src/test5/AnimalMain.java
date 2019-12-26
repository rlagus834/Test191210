package test5;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dg=new Dog();
dg.sound();
dg.breath();
Cat ct=new Cat();
ct.sound();
ct.breath();
//다형성 (polymorphism) @부모 클래스라 가능한거고 동등한 자식클래스는 불가(급이 안맞음)
Animal ani=new Dog();
ani.sound();
ani=new Cat();
ani.sound();











	}

}
