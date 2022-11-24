package algorism_study;

import java.util.Arrays;
import java.util.Scanner;

public class P1744 {
	static int K;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];

		for (int i = 0; i < N; i++)
			A[i] = scan.nextInt();
		Arrays.sort(A);

		int sum = 0;
		// 양수만 존재
		for (int i = N - 1; i > 0; i--) {
			if (i > -1) {
				// 근접한 두수가 양수
				if (A[i] > 1 && A[i - 1] > 0) {
					sum += A[i] * A[i - 1];
					i--;
					// 근접한 두수가 양수이나 1인 경우
				} else if (A[i] == 1 || A[i - 1] == 1)
					sum += A[i];
				// 근접한 두수가 양수이거나 음수인 경우
				else {
					K = i;
					break;
				}
			}

		}

		for (int j = 0; j <= K; j++) {
			if (K - 1 >= (2 * j)) {
				sum += A[j] * A[j + 1];
				j++;
			} else
				sum += A[j];
		}
		
		System.out.println(sum);

	}

}