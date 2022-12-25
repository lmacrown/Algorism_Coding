package algorism;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1325_AS {
	static int N, M;
	static boolean visited[];
	static int answer[];
	static ArrayList<Integer>[] A;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = new ArrayList[N+1];
		answer = new int [N+1];
		
		for (int i = 1; i <= N; i++)
			A[i] = new ArrayList<>();

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int E = Integer.parseInt(st.nextToken());
			int S = Integer.parseInt(st.nextToken());
			A[S].add(E);
		}

		for (int i = 1; i <= N; i++) {
			visited = new boolean[N + 1];
			BPS(i);
		}
		
		int maxVal = 0;

		for (int i = 1; i <= N; i++) {
			maxVal = Math.max(maxVal, answer[i]);
		}
		for(int i=1;i<=N;i++) {
			if(answer[i] == maxVal)
				System.out.println(i+" ");
		}
	}

	private static void BPS(int Node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(Node);
		visited[Node] = true;
		while (!queue.isEmpty()) {
			int now_Node = queue.poll();
			for (int i : A[now_Node]) {

				if (visited[i]==false) {
					visited[i] = true;
					answer[i]++;
					queue.add(i);
				}
			}
		}
	}

}
