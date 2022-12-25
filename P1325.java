package algorism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1325 {
	static boolean visited[];
	static ArrayList<Integer>[] A;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 두개를 입력하시오");
		int N = scan.nextInt();
		int M = scan.nextInt();

		
		A = new ArrayList[N + 1];
		int[] B = new int[N + 1];
		for (int i = 1; i <= N; i++)
			A[i] = new ArrayList<Integer>();
		int max = 0;

		for (int i = 0; i < M; i++) {
			int E = scan.nextInt();
			int S = scan.nextInt();
			A[S].add(E);
		}

		for (int i = 1; i <= N; i++) {
			if (!A[i].isEmpty())
				System.out.println(i + "->" + A[i]);
		}

		for (int i = 1; i <= N; i++) {
			visited = new boolean[N + 1];
			B[i] = BPS(i);
			System.out.println(i+" : "+B[i]);
		}

		Arrays.sort(B);
		for (int i = 1; i <= N; i++) {
			if(B[i]==B[0])
				System.out.println(i);
		}
	}

	private static int BPS(int Node) {
		int count=0;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(Node);
		visited[Node] = true;
		while (!queue.isEmpty()) {
			int now_Node = queue.poll();
			for (int i : A[now_Node]) {

				if (!visited[i]) {
					// System.out.println(i+"_"+visited[i]+"_"+visited[now_Node]);
					count++;
					visited[i] = true;
					queue.add(i);
				}
			}
		}
		return count;
	}

}
