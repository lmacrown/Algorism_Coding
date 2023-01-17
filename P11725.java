package algorism;

import java.util.ArrayList;
import java.util.Scanner;

public class P11725 {
   static ArrayList<Integer>[] list;
   static boolean[] visited;
   static int A[];
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      System.out.println("숫자를 입력하시오");
      Scanner scan = new Scanner(System.in);
      int x = scan.nextInt();
      list = new ArrayList[x+1];
      A = new int[x+1];
      for (int i = 0; i <= x; i++) {
         list[i] = new ArrayList<>();
      }
      System.out.println("숫자를 " + x + "개 연결 노드를 입력하시오");
        for(int i = 1; i < x; i++) {
               int a = scan.nextInt();
               int b = scan.nextInt();
               list[a].add(b);
               list[b].add(a);
           }
      for (int i = 1; i <= x; i++)
         System.out.println(i+"->"+list[i]);
      visited = new boolean[x+1];
      DFS(1);
      for(int i=2;i<=x;i++)
         System.out.println(A[i]);
   }

   static void DFS(int v) {
      visited[v] = true;
      for (int i : list[v]) {
         if (visited[i] == false) {// 노드에 방문한적 없으면 DFS 수행
            A[i]=v;
            DFS(i);

         }
      }
   }
}