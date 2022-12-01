package algorism2;

import java.util.Scanner;

public class P1456 {
	static int N;
	static int M;
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		for(int i=N;i<M;i++) {
			isPrime(i);
		}
		System.out.println(count);

	}
	public static void isPrime(int x) {
		
		if(x==1) {
			return;
		}else if(x==2) {
			squarePrime(x);
		}
		else {
			for(int i=2;i<x;i++) {
				if(x%i==0)
					return;
			}
			squarePrime(x);
		}
		
	}
	public static void squarePrime(int a) {
		for(int i=2;i<10;i++) {
			if((int)Math.pow(a, i)<M) {
				count++;
			}else
				break;
		}
	}

}
