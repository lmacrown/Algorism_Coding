package algorism;

import java.util.Scanner;

public class P1976 {
   public static int[] parent;
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int M = scan.nextInt();
      int[][] C = new int[N+1][N+1];
      for(int i=1;i<=N;i++) {
         for(int j=1;j<=N;j++)
            C[i][j]=scan.nextInt();
      }
      int[] R = new int[M+1];
      for(int i=1;i<=M;i++)
         R[i]=scan.nextInt();
      parent= new int [N+1];
      for(int i=1;i<=N;i++)
         parent[i]=i;
      for(int i=1;i<=N;i++) {
         for(int j=1;j<=N;j++) {
            if(C[i][j]==1) union(i,j);
         }
      }
      int index = find(R[1]);
      for(int i=2;i<R.length;i++) {
         if(index!=find(R[i])) {
            System.out.println("NO");
            return;
         }
      }
      System.out.println("YES");
   }
   public static void union(int a, int b) {
      a=find(a);
      b=find(b);
      if(a!=b) {
         parent[b]=a;
      }
   }
   public static int find(int a) {
      if(a==parent[a])
         return a;
      else
         return parent[a]=find(parent[a]);
   }

}