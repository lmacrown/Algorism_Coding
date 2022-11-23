package algorism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ch05_sec05 {
   static boolean visited[];
   static ArrayList< Edge>[] A;
   static int[] distance;

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      A = new ArrayList[N+1];
      for(int i=1;i<N+1;i++)
         A[i]=new ArrayList<Edge>();
      for (int i = 1; i < N+1; i++) {
         int S=scan.nextInt();
         while(true) {
            int E=scan.nextInt();
            if(E==-1)
               break;
            int V=scan.nextInt();
            A[S].add(new Edge(E,V));
         }
         
      }
      distance=new int[N+1];
      visited =new boolean[N+1];
      BFS(1);
      int Max=1;
      for(int i=2;i<=N;i++)
         if(distance[Max]<distance[i])
            Max=i;
      distance = new int[N+1];
      visited = new boolean[N+1];
      BFS(Max);
      Arrays.sort(distance);
      System.out.println(distance[N]);

//      for (int i = 1; i < N+1; i++)
//         System.out.println(A[i]);
   }

   private static void BFS(int x) {
      Queue<Integer> queue = new LinkedList<Integer>();
      queue.add(x);
      visited[x]=true;
      while(!queue.isEmpty()) {
         int now_node=queue.poll();
         for(Edge i:A[now_node]) {
            int e=i.e;
            int v=i.value;
            if(!visited[e]) {
               visited[e]=true;
               queue.add(e);
               distance[e]=distance[now_node]+v;
            }
         }
         
      }
   }
   static class Edge{
      int e;
      int value;
      public Edge(int e, int value) {
         this.e=e;
         this.value=value;
      }
   }
}