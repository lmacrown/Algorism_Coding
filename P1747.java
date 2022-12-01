package algorism2;

import java.util.Scanner;

public class P1747 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		while (true) {
			if (isPrime(N) != 0) {
				if (Palidrom(N)) {
					System.out.println(N);
					break;
				}
			}
			N++;
		}

	}

	public static int isPrime(int x) {
		if (x == 1) {
			return 0;
		} else if (x == 2)
			System.out.println(2);
		else {
			for (int i = 2; i < x; i++) {
				if (x % i == 0)
					return 0;
			}
			return x;
		}
		return 0;
	}

	public static boolean Palidrom(int x) {
		String a = Integer.toString(x);
		String[] b = new String[a.length()];
		for (int i = 0; i < a.length(); i++) {
			b[i] = a.substring(i, i + 1);
		}
		for (int i = 0; i < a.length(); i++) {
			if (b[i].equals(b[a.length() - i - 1])) {
				return true;
			}
		}
		return false;
	}
}
