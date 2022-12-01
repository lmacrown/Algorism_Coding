package algorism2;

import java.util.Scanner;

public class P1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		for(int i=N;i<M;i++) {
			isPrime(i);
		}

	}
	public static void isPrime(int x) {
		if(x==1) {
			return;
		}else if(x==2)
			System.out.println(2);
		else {
			for(int i=2;i<x;i++) {
				if(x%i==0)
					return;
			}
			System.out.println(x);
		}
	}
}
