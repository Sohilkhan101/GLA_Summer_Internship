package Lecture2;

import java.util.Scanner;

public class Pattern9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n-1;

		while (row <= n) {

			for (int i = 1; i <= nsp; i++) {
				System.out.print("  ");
			}

			for (int i = 1; i <= nst; i++) {
				System.out.print("* ");
			}

			nst += 2;
			nsp--;
			System.out.println();
			row++;
		}
		sc.close();

	}
}
