package algorism2;

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
					String[] C = B[i].split("+");
					for(String j:C)
						sum += Integer.parseInt(j);
				}else
					sum+=Integer.parseInt(B[0]);
			} else {
				if (B[i].contains("+")) {
					String[] C = B[i].split("\\+");
					for(String j : C)
						sum -= Integer.parseInt(j);
				}
			}
		}
		System.out.println(sum);
	}
}