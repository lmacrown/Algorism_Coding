package algorism2;

import java.util.Scanner;

public class P1016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1 2 3  5 6 7   10
		Scanner scan = new Scanner(System.in);
		int min = scan.nextInt();
		int max = scan.nextInt();
		int count = 0;
		for (int i = min; i <= max; i++) {
			for (int j = 2; j <= max; j++) {
				if (i % Math.pow(j, 2) == 0) {
					System.out.println(i);
					break;
				}else if(j==max){
					count++;	
				}else if(Math.pow(j, 2)>i && i!=1) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
