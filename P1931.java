package algorism_study;

import java.util.ArrayList;
import java.util.Scanner;

public class P1931 {
	static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하시오");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		System.out.println("시작 시간과 끝나는 시간을 입력하시오");
		ArrayList<Integer>[] A = new ArrayList[N];
		for (int i = 0; i < N; i++)
			A[i] = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int S = scan.nextInt();
			int E = scan.nextInt();
			A[i].add(S);
			A[i].add(E);
		}
		for (int i = 0; i < N; i++) {
			System.out.println(A[i]);
		}

		int maxCount = 0;
		for (int i = 0; i < N; i++) {
			int E = A[i].get(0);
			int S = A[i].get(1);
			for (int k = E; k <= S; k++) {
				count = 0;
				for (int j = 0; j < N; j++) {
					int e = A[j].get(0);
					int s = A[j].get(1);
					
					if (k > e && k < s) {
						System.out.println(k + " : " + e + " " + s);
						count++;
						continue;
					}
				}
			}
			if (maxCount < count)
				maxCount = count;
		}
		System.out.println(maxCount);
	}
}