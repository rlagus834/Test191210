package baekjun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		List<int[][]> list=new ArrayList<int[][]>();
		int xsave=0,ysave=0;
		
//		[y][x] 1씩for문으로 채운다
		boolean run=true;
		   while(run) {
			   int input=scan.nextInt();
			   switch(input) {
			   case 1:
				   System.out.println("y1");
					int y1=scan.nextInt();
					System.out.println("x1");
					int x1=scan.nextInt();
					System.out.println("y2");
					int y2=scan.nextInt();
					System.out.println("x2");
					int x2=scan.nextInt();
					if(y1==y2||x1==x2){
						//
						System.out.println("생성불가");
					}else{

					if(y1>y2){

					if(x1>x2){
			//
				int[][] ar=new int[y1-y2][x1-x2];
				list.add(ar);
				for(int i=0;i<ar[i].length;i++) {
					for(int j=0;j<ar[i].length;j++) {
						ar[i][j]=1;					
					}
				}
				list.add(ar);	
					}else{
			//
						int[][] ar=new int[y1-y2][x2-x1];

						for(int i=0;i<ar[i].length;i++) {
							for(int j=0;j<ar[i].length;j++) {
								ar[i][j]=1;					
							}
						}
						list.add(ar);
					}

					}else{
					if(x1>x2){
			//
						int[][] ar=new int[y2-y1][x1-x2];
						for(int i=0;i<ar[i].length;i++) {
							for(int j=0;j<ar[i].length;j++) {
								ar[i][j]=1;					
							}
						}
						list.add(ar);
					}else{
			//
						int[][] ar=new int[y2-y1][x2-x1];
						for(int i=0;i<ar[i].length;i++) {
							for(int j=0;j<ar[i].length;j++) {
								ar[i][j]=1;					
							}
						}
						list.add(ar);
					}

					}

					}
				   break;
			   case 2:
				   
				   break;
			   case 3:
				   run=false;
			   }
	
		
		   }
		
		   
		
		
		
		
		
		
		
		
		
		
		
	}

}
