package Lecture4;

import java.util.Scanner;

public class ReplaceThemAll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		if (n == 0) {
			System.out.println(5);
			
		}
		else {
		long ans = 0;
		long mul = 1;

		while (n != 0) {
			long rem = n % 10;
			if (rem == 0) {
				ans = ans + 5 * mul;
			} else {
				ans = ans + rem * mul;
			}
			mul *= 10;
			n /= 10;
		}
		System.out.println(ans);
		sc.close();
		}
	}

}
