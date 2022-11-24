package algorism_study;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P1744_AS {
	static int K;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		PriorityQueue<Integer> plusPq = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> minusPq = new PriorityQueue<>();
		int one = 0;
		int zero = 0;

		for (int i = 0; i < N; i++) {
			int data = scan.nextInt();
			if (data > 1)
				plusPq.add(data);
			else if (data == 1)
				one++;
			else if (data == 0)
				zero++;
			else
				minusPq.add(data);
		}

		int sum = 0;
		while (plusPq.size() > 1) {
			int first = plusPq.remove();
			int second = plusPq.remove();
			sum = sum + first * second;
		}

		if(!plusPq.isEmpty())
			sum=sum+plusPq.remove();
		
		while (minusPq.size() > 1) {
			int first = minusPq.remove();
			int second = minusPq.remove();
			sum = sum + first * second;
		}
		
		if (!minusPq.isEmpty()) {
			if (zero == 0)
				sum = sum + minusPq.remove();
		}
		sum = sum + one;
		System.out.println(sum);
	}
}