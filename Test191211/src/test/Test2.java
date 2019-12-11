package test;

public class Test2 {

	public static void main(String[] args) {
//합계가100이넘는순간종료
		int count = 0, sum = 0, s = 1, num1 = 0, num2 = 0;
		boolean run = true;
		while (run) {
			count++;
			num1 = s * count;
			if (sum >= 100) {
				run = false;
			} else {
				num2 = num1;
				s = -s;
				sum += num1;
			}
		}
		System.out.println(num2);
	}

}
