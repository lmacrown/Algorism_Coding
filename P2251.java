package algorism;

import java.util.Arrays;
import java.util.Scanner;

public class P2251 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 세개를 입력하시오");
		int A=scan.nextInt();
		int B=scan.nextInt();
		int C=scan.nextInt();
		int i=0;
		int[] array = new int[5];
		System.out.println(A);
		array[i]=A; i++;
		if(A+B<C) {
			System.out.println(C-A-B);
			array[i]=C-A-B; i++;
		}
		else {
			System.out.println(C-A);
			array[i]=C-A; i++;
			System.out.println(C-B);
			array[i]=C-B; i++;
		}
		System.out.println(B);
		array[i]=B; i++;
		System.out.println(C);
		array[i]=C;
		Arrays.sort(array);
		for(int j=0;j<5;j++)
			System.out.print(array[j]+" ");
	}

}
