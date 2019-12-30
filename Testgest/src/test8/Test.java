package test8;

import java.util.Scanner;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int max=0;
		int count=0;
List<Integer> list=new ArrayList<Integer>();
list.add(3);
list.add(29);
list.add(38);
list.add(12);
list.add(57);
list.add(74);
list.add(40);
list.add(85);
list.add(61);
for(int i=0;i<list.size();i++) {
	if(max<list.get(i)) {
		max=list.get(i);
	}
	
}
System.out.println(max);
for(int i=0;i<list.size();i++) {
	if(max==list.get(i)) {
		count=i;
	}
	
}
System.out.println(count);






		}
	}


