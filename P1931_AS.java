package algorism_study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1931_AS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] A = new int[N][2];
		for(int i=0;i<N;i++) {
			A[i][0]=scan.nextInt();
			A[i][1]=scan.nextInt();
		}
		Arrays.sort(A, new Comparator<int[]>(){
			@Override
			public int compare(int[] S, int[] E) {
				if(S[1]==E[1])
					return S[0]-E[0];
				return S[1]-E[1];
			}
		});
		int count=0;
		int end=-1;
		for(int i =0;i<N;i++) {
			if(A[i][0]>=end) {
				end=A[i][1];
				count++;
			}
		}
		System.out.println(count);
	}

}
