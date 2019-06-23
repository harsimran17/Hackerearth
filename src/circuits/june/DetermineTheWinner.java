package circuits.june;

import java.util.Scanner;

public class DetermineTheWinner {

	public static int grundy(long n) {
		if (n == 0)
			return 0;
		else {
			MEX(n);
			return grundy(n - 1);
		}
	}
	
	

	private static void MEX(long n) {
		// Implemented at Office
		
	}



	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for (int i = 0; i < T; i++) {
			long N = s.nextLong();
			long K = s.nextLong();

			/*
			 * boolean arpa = true; while (N > 0) { long turn = K; if (N - K >
			 * K) { N -= turn; } else { if (!arpa) { System.out.println("Arpa");
			 * } else { System.out.println("Dishant"); } break; } if (arpa) {
			 * System.out.println("Arpa picked " + turn + " cards"); arpa =
			 * false; } else { System.out.println("Dishant picked " + turn +
			 * " cards"); arpa = true; }
			 * 
			 * System.out.println("Remaining cards are: " + N);
			 * 
			 * }
			 */

		}
		s.close();
	}

}
