package test;

public class Car {

	
	String color;
	int speed;
	String type;
	String model;
	String company="벤틀리";
	
	//기본생성자 선언
	
Car(){
	//필드값을 세팅 or
	//매개변수로 넘겨받은 값을 필드값으로 세팅
	type="하이브리드";
}







	//매개변수가 있는 생성자 선언
//매개변수 :color,speed 매개(연결)
Car(String color, int speed)	{
	this.color=color;//필드로씀(매개변수에서 넘겨받아 대입받은 값을 필드로씀)this란?필드를지칭할때사용
	this.speed=speed;		
}
Car(String color, String company){
	
	this.color=color;
	this.company=company;
}
Car(String color, int speed, String type, String model, String company){
	this.color=color;//필드로씀(매개변수에서 넘겨받아 대입받은 값을 필드로씀)this란?필드를지칭할때사용
	this.speed=speed;	
	this.type=type;
	this.model=model;
	this.company=company;
	
}

//생성자가 하나라도 생성하면 기본생성자는 없다고 봐도된다...(기본생성자를 선언하고싶으면 따로 만들어줘야함
//Car(){                  <이런식으로!
//	
//}



@Override
public String toString() {
	return "Car [color=" + color + ", speed=" + speed + ", type=" + type + ", model=" + model + ", company=" + company
			+ "]";
}//메소드






	
	
	

}
