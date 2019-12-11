package test;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0, sum = 0, sum2 = 0;
		boolean run = true;
		while (run) {
			a++;
			if (sum2 - sum >= 100) {
				run = false;
			} else if (a % 2 == 0) {
				sum += a;
			} else {
				b = a;
				sum2 += a;
			}
		}
		System.out.println(b);

	}

}
