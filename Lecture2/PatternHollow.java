package Lecture2;

public class PatternHollow {
	public static void main(String[] args) {
		int n = 9;

		int row = 0;
		int nst1 = n / 2 + 1;
		int nst2 = n / 2 + 1;
		int nsp = -1;

		while (row < n) {

			for (int i = 0; i < nst1; i++) {
				System.out.print("*");
			}

			for (int i = 0; i < nsp; i++) {
				System.out.print(" ");
			}

			if (row == 0 || row == n - 1) {
				for (int i = 0; i < nst2 - 1; i++) {
					System.out.print("*");
				}
			} else {
				for (int i = 0; i < nst2; i++) {
					System.out.print("*");
				}
			}

			if (row < n / 2) {
				nst1--;
				nst2--;
				nsp += 2;
			} else {
				nst1++;
				nst2++;
				nsp -= 2;
			}
			System.out.println();

			row++;

		}

	}

}
