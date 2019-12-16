package test;

public class CarMain {

	public static void main(String[] args) {
		// Car클래스를 객체로선언
//객체선언문법
//		클래스이름 객체이름 =new 클래스이름();
//		                                           생성자이름();
		//같은곳에서 생성됬지만 각각 다른객체
//()는 호출한다는 의미		
		Car car =new Car();  //기본생성자 = 굳이 지정안해도 생성자가 있는것 
		Car car1 =new Car();
		Car car2 =new Car();
		//객체선언 =변수선언(Car타입의 car3라는 변수명을 선언한다 값은 null대입)
		Car car3 =null;
//		car3=new car3();
//Car 클래스에 있는 필드 사용
//		안되는이유=정확한 위치를알려줘야함
//		color="검정"; 나쁜예
//		car.color="검정"; 좋은예
//System.out.println(car.color);
//같이생성된 곳을 이용하지만 서로 다른객체 다른위치를 사용함 (초기값은 0이거나 null)
//System.out.println(car1.color);

//		수정가능
		car.company="bmw";
//System.out.println(car.company);
//System.out.println(car1.company);
car.speed=100;
//계산같은것에도 응용가능
int speedUp=car.speed+50;
//System.out.println(speedUp);
//System.out.println(car.type);

//매개변수가 있는 생성자를 호출하여 객체 선언
Car car4=new Car("빨강",150);
//car4객체가 가지고있는 필드값 모두 출력

//System.out.println(car4.color);
//System.out.println(car4.speed);	
//System.out.println(car4.model);
//System.out.println(car4.company);
//System.out.println(car4.type);



//Car car5=new Car();
//System.out.println(car5.type);

//생성자를 선언하고
//main클래스에서 이 생성자를 이용하여 객체를 선언후
//전체필드값출력

Car car5=new Car("빨강","초록"); //<생성자=객체를 만들어 호출할때 사용
System.out.println(car5.color);
System.out.println(car5.speed);	
System.out.println(car5.model);
System.out.println(car5.company);
System.out.println(car5.type);

//상속개념
//overriding
//overloading

System.out.println(car5.toString());//생성자에 있는 필드값 한번에 볼때 쓰는방법
System.out.println(car.company);//위에 보면 bmw로 수정해서 벤틀리가 안뜨거임
//Car클래스의 모든 필드를 매개값으로 하는 생성자를 선언하고
//이 생성자 호출로 객체를 선언하여 모든 필드값 출력;
Car car6=new Car("빨강",5,"가","나","");
System.out.println(car6.toString());















	}

}
