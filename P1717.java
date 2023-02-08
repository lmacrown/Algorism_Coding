package algorism;

import java.util.Scanner;

public class P1717 {

	public static int[] parent;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		parent = new int[N + 1];
		for (int i = 0; i <= N; i++)
			parent[i] = i;
		for (int i = 0; i < M; i++) {
			int question = scan.nextInt();
			int a = scan.nextInt();
			int b = scan.nextInt();
			if (question == 0) {
				union(a, b);
				System.out.println("["+a+","+b+"] =>"+"parent["+b+"]"+"="+a);
			}
			else {
				if (checkSame(a, b))
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}

	public static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if (a != b)
			parent[b] = a;
		//p[3]=1 p[6]=7 p[7]=3 p[2]=4
		//(1,3)=> p[3]=1
		//(7,6)=> p[6]=7
		//(1,3,6,7)/(2,4)
	}

	public static int find(int a) {
		if (a == parent[a])
			return a;
		else
			return parent[a] = find(parent[a]);
		
	}

	public static boolean checkSame(int a, int b) {
		a = find(a);
		b = find(b);
		System.out.println("checkSame : "+a+","+b);
		if (a == b)
			return true;
		return false;
	}

}