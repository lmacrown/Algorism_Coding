package algorism_study;

import java.util.Scanner;

public class P1541 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("연산식을 입력하시오");
		Scanner scan = new Scanner(System.in);
		String A = scan.nextLine();

		String B[] = A.split("-");
		int sum = 0;
		for (String i : B)
			System.out.println(i);
		for (int i = 0; i < B.length; i++) {
			if (i == 0) {
				if (B[i].contains("+")) {
					String[] C = B[i].split("\\+");
					sum += Integer.parseInt(C[i]);
				}
			} else {
				if (B[i].contains("+")) {
					String[] C = B[i].split("\\+");
					sum -= Integer.parseInt(C[i]);
				}
			}
		}
		System.out.println(sum);
	}
}
