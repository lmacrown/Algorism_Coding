package algorism_study;

import java.util.Scanner;

public class P11047 {
	static int count=0;
	static int N;
	static int K;
	static int[] A;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 N= scan.nextInt();
		 K = scan.nextInt();
		
		A=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=scan.nextInt();
			System.out.println(A[i]);
		}
		DIV(K);
		System.out.println(count);
	}
	public static void DIV(int x) {
		for(int i=N-1;i>=0;i--) {
			if(x/A[i]>0) {
				count+=x/A[i];
				
				int D=x%A[i];
				if(D==0) {
					System.out.println(count);
					System.exit(0);
				}
				else
					DIV(D);
			}
		}
	}

}
