package algorism;

import java.util.Arrays;
import java.util.Scanner;

public class ch05_sec08_AS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A =new int[N];
		for(int i=0;i<N;i++)
			A[i]=scan.nextInt();
		Arrays.sort(A);
		int M = scan.nextInt();
		for(int i=0;i<M;i++) {
			boolean find = false;
			int target = scan.nextInt();
			int start=0;
			int end = A.length-1;
			while(start<=end) {
				int midi=(start+end)/2;
				int midV = A[midi];
				if(midV>target)
					end = midi-1;
				else if (midV<target)
					start = midi+1;
				else {
					find = true;
					break;
				}
			}
			if(find)
				System.out.println(1);
			else
				System.out.println(0);
					
		}

	}

}
