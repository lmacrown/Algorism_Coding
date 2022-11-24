package algorism_study;

import java.util.Arrays;
import java.util.Scanner;

public class P1715 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++)
			A[i]=scan.nextInt();
		Arrays.sort(A);
		int finalsum=0;
		for(int i=0;i<N-1;i++) {
			A[i+1]+=A[i];
			finalsum+=A[i+1];
			Arrays.sort(A);
		}
		System.out.println(finalsum);
	}

}
