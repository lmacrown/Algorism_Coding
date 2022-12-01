package algorism_study;

import java.util.Scanner;

public class P1016_AS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long Min = in.nextInt();
		long Max = in.nextInt();
		boolean[] Check = new boolean[(int) (Max-Min+1)];
		
		for (long i = 2; i*i <= Max; i++) {
			long pow=i * i;
			long start_index = Min/pow;
			if(Min % pow !=0)
				start_index++;
			for(long j = start_index;pow*j<=Max;j++)
				Check[(int) ((j*pow)-Min)]=true;
		}
		int count=0;
		for(int i=0;i<=Max-Min;i++) {
			if(!Check[i])
				count++;
		}
		System.out.println(count);
	}

}
