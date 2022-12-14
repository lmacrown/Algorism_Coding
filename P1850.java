package algorism_study;

import java.util.Scanner;

public class P1850 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1입력");
		int num1 = sc.nextInt();

		System.out.print("숫자2입력");
		int num2 = sc.nextInt();

		int max = 0; // 최대 공약수

		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				max = i;
			}
		}
		for(int i=0;i<max;i++)
			System.out.print(1);
	}

}
