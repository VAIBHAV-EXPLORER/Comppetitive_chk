package practise;

import java.util.Scanner;

public class Ad_chg {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int t = 1;
		while (t-- > 0) {
			int n = in.nextInt();
			String s = Integer.toString(n);
			int k=Integer.parseInt(String.valueOf(s.charAt(0)));
			System.out.println(k);
			int sum = (Integer.parseInt(String.valueOf(s.charAt(0))))+(Integer.parseInt(String.valueOf(s.charAt(s.length()-1))));
			System.out.println(sum);
		}
	}
}
