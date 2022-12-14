package algorism_study;

import java.util.Scanner;

public class P1934_AS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = a * b / gcb(a, b);
			System.out.println(result);
		}
	}

	public static int gcb(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcb(b, a % b);
	}

}
