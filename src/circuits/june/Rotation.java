package circuits.june;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		String S = s.next();
		String T = s.next();
		for (int i = length; i > 0; i--) {
			String temp = T.substring(0, i);
			if(S.contains(temp)){
				System.out.println(length-i);
				break;
			}
		}
		s.close();
	}

}
