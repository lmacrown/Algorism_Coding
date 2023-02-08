package algorism;

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
		Arrays.sort(A, new Comparator<int[]>(){//끝나는 시간으로 정렬
			@Override
			public int compare(int[] S, int[] E) {
				if(S[1]==E[1])//끝나는 시간이 같을경우 시작하는 시간으로 정렬
					return S[0]-E[0];
				return S[1]-E[1];
			}
		});
		for(int i=0;i<N;i++)
			System.out.println(A[i][0]+" "+A[i][1]);
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