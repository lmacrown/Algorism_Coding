package algorism_study;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P1715_AS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N= scan.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<N;i++) {
			int data=scan.nextInt();
			pq.add(data);
		}
		int data1=0;
		int data2=0;
		int sum=0;
		while(pq.size()!=1) {
			data1=pq.remove();
			data2=pq.remove();
			sum+= data1+data2;
			pq.add(data1+data2);
		}

		System.out.println(sum);
	}

}
