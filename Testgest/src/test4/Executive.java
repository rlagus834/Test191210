package test4;

public class Executive extends Manager{
int bonus;

public int getBonus() {
	return bonus;
}

public void setBonus(int bonus) {
	this.bonus = bonus;
}

public Executive(String name, int bonus,int sudang, int sal,int up) {
	super();
	this.name=name;	
	this.bonus = bonus;
	this.sudang=sudang;
	
	if(up==1) {
		this.sal=sal*1.1;
		
	}else if(up==2){
		this.sal=sal*1.2;
	}else if(up==3){
		this.sal=sal*1.3;
	}
	
}



@Override
public String toString() {
	return "Executive [bonus=" + bonus + ", sudang=" + sudang + ", name=" + name + ", sal=" + sal + "]";
}





}
