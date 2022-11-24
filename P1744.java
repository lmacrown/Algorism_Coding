package algorism_study;

import java.util.Arrays;
import java.util.Scanner;

public class P1744 {
	static int K;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		
		for (int i = 0; i < N; i++)
			A[i] = scan.nextInt();
		Arrays.sort(A);
	
		int sum = 0;
		for (int i = N - 1; i > K; i--) {
			if (i>-1) {
				if (A[i] > 1 && A[i - 1] > 0) {
					sum += A[i] * A[i - 1];
					i--;
				} 
				else
					sum+=A[i];
			}
			
		}
		//음수가 2개 일떄는 구현 안함
		/*
		 * for(int i=0;i<N;i++) { if(A[i]<=0) { K=i; }else break; }
		 * 
		 * int[] B= new int[K+1]; for(int i=0;i<N;i++) { if(A[i]<=0) { B[i]=A[i]; } }
		 */
		
		/*
		 * for (int i = 0; i <= K; i++) { if (i>-1) { if (A[i] > 1 && A[i - 1] > 0) {
		 * sum += A[i] * A[i - 1]; i--; } else sum+=A[i]; }
		 * 
		 * }
		 */
		System.out.println(sum);

	}

}
