package algorism;

import java.util.Arrays;
import java.util.Scanner;

public class ch05_sec08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int N = scan.nextInt();
		int[] M = new int[N];
		
		System.out.println(N+"개의 숫자를 입력하시오");
		for(int i=0;i<N;i++)
			M[i] = scan.nextInt();
		
		System.out.println("숫자를 입력하시오");
		int A = scan.nextInt();
		int[] B = new int[A];
		System.out.println(A+"개의 숫자를 입력하시오");
		for(int i=0;i<N;i++)
			B[i] = scan.nextInt();
		
		for(int i=0;i<N;i++) {
			int C=0;
			for(int j=0;j<A;j++) {
				if(B[i]==M[j]) {
					C=1;
					break;
				}
			}
			System.out.println(C);
				
		}
	}

}
