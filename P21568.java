package algorism_study;

import java.util.Scanner;

public class P21568 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 세개를 입력하시오");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		boolean result = false;
		int x = 0;
		int y = 0;
		for (int i = -100000; i <= 100000; i++) {
			for (int j = -100000; j <= 100000; j++) {
				if (a * i + b * j == c) {
					x = i;
					y = j;
					result = true;
				}
			}
		}
		if (result)
			System.out.println("x,y = " + x + ", " + y);
		else
			System.out.println("-1");
	}

}
