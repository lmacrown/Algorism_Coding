package algorism;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class P2252 {
   public static int[] parent;
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int M = scan.nextInt();
      parent = new int[N + 1];
      for (int i = 1; i <= N; i++)
         parent[i] = i;
      for(int i=0;i<M;i++) {
         int a = scan.nextInt();
         int b = scan.nextInt();
         union(a, b);
      }
      String[] arr= new String[N+1];
      for(int i=1;i<=N;i++) {
         arr[i]=Integer.toString(parent[i]);
      }
       HashSet<String> hashSet = 
                   new HashSet<>(Arrays.asList(arr));
       String[] resultArr = hashSet.toArray(new String[0]);
      for(int i=1;i<N;i++)
         System.out.print(resultArr[i]+" ");
      System.out.println(N);

   }
   public static void union(int a, int b) {
      parent[b] = a;
   }
}