package algorism;

import java.util.Arrays;
import java.util.Scanner;

public class ch05_sec10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[][] A = new int[N+1][N+1];
		int[] B = new int[(N)*(N)+1];
		for(int i=1;i<N+1;i++) {
			for(int j=1;j<N+1;j++) {
				A[i][j]=i*j;
				B[N*(i-1)+j]=A[i][j];
			}
		}
		Arrays.sort(B);
		System.out.println(B[K]);
	}

}
