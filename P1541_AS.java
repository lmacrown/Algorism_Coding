package algorism2;

import java.util.Scanner;

public class P1541_AS {
	static int answer=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String example = scan.nextLine();
		String[] str = example.split("-");
		for(int i =0; i<str.length; i++) {
			int temp = mySum(str[i]);
			if(i==0)
				answer+=temp;
			else
				answer-=temp;
		}
		System.out.println(answer);
		
	}
	static int mySum(String a) {
		int sum =0;
		String temp[] = a.split("[+]");
		for(int i=0; i<temp.length;i++)
			sum+= Integer.parseInt(temp[i]);
		return sum;
	}
}