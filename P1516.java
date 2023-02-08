package algorism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1516 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();

      ArrayList<ArrayList<Integer>> A = new ArrayList<>();
      for (int i = 0; i <= N; i++)
         A.add(new ArrayList<>());
      int[] indegree = new int[N + 1];
      int[] time = new int[N + 1];
      for (int i = 1; i <= N; i++) {
         time[i] = scan.nextInt();
         int E = scan.nextInt();
         while (E != -1) {
            A.get(E).add(i);
            indegree[i]++;
            E=scan.nextInt();
         }
      }
      Queue<Integer> queue = new LinkedList<>();
      for (int i = 1; i <= N; i++) {
         if (indegree[i] == 0)
            queue.offer(i);
      }
      int[] result = new int[N + 1];
      while (!queue.isEmpty()) {
         int now = queue.poll();
         for (int next : A.get(now)) {
            indegree[next]--;
            result[next] = Math.max(result[next], result[now] + time[now]);
            if (indegree[next] == 0)
               queue.offer(next);
         }
      }
      for (int i = 1; i <= N; i++)
         System.out.println(result[i] + time[i]);
   }
}