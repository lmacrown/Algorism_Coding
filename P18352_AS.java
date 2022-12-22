package algorism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ch08_sec01 {

	static int visited[];
	static ArrayList<Integer>[] A;
	static List<Integer> answer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("도시수 N개, 도로의 개수 M개, 거리정보 K, 출발 도시의 번호 X를 입력하시오");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int K = scan.nextInt();
		int X = scan.nextInt();
		A = new ArrayList[N + 1];
		answer = new ArrayList<>();

		for (int i = 1; i <= N; i++)
			A[i] = new ArrayList<Integer>();

		System.out.println("연결된 도시를 입력하시오");
		for (int i = 0; i < M; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			A[a].add(b);
			System.out.println(i+"->"+A[i]+ " ");
		}
		visited = new int[N + 1];
		for (int i = 0; i <= N; i++)
			visited[i] = -1;
		BFS(X);
		for (int i = 0; i <= N; i++) {
			if (visited[i] == K)
				answer.add(i);
		}

		System.out.println("최단거리 " + K + "인 도시는 ");
		if (answer.isEmpty())
			System.out.println("-1");
		else {
			Collections.sort(answer);
			for (int temp : answer) {
				System.out.println(temp);
			}
		}

	}

	private static void BFS(int Node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(Node);
		visited[Node]++;
		while (!queue.isEmpty()) {
			int now_Node = queue.poll();
			for (int i : A[now_Node]) {
				if (visited[i] == -1) {
					visited[i] = visited[now_Node] + 1;
					queue.add(i);
				}
			}
		}
	}
}