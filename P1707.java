package algorism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1707 {
	static ArrayList<Integer> A[];
	static boolean visited[];
	static int count;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("케이스 갯수를 입력하시오");
		int N = scan.nextInt();
		
		for (int j = 0; j < N; j++) {
			System.out.println("정점의 수와 간선의 수를 4개 입력하시오");
			A=new ArrayList[5];
			visited = new boolean[5];
			
			for(int i=1;i<5;i++)
				A[i] = new ArrayList<Integer>();
			
			for (int i = 0; i < 4; i++) {
				int E=scan.nextInt();
				int S = scan.nextInt();
				A[E].add(S);
			}
			for(int i=1;i<5;i++)
				System.out.println(i+"->"+A[i]);
			
			boolean result = false;
			for(int i=1;i<4;i++) {
				BPS(i);
				if(count==4) {
					result=true;
					break;
				}
				else
					continue;
			}
			
			if(result)
				System.out.println("NO");
			else
				System.out.println("YES");
		}

	}
	public static void BPS(int Node) {
		count=1;
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[Node]=true;
		queue.add(Node);
		while(!queue.isEmpty()) {
			int Now_node=queue.poll();
			for(int i : A[Now_node]) {
				if(!visited[i]) {
					count++;
					visited[i]=true;
					queue.add(i);
				}
			}
		}
	}

}
