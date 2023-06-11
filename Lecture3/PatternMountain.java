package Lecture3;


public class PatternMountain {
	public static void main(String[] args) {
		int n = 4;
		int row = 1;
		int nsp = 2 * n - 3;
		int nst1 = 1;
		int nst2 = 1;
		while (row <= n) {

			// val1
			int val = 1;
			for (int i = 1; i <= nst1; i++) {
				System.out.print(val + " ");
				val++;
			}

			// Space
			for (int i = 1; i <= nsp; i++) {
				System.out.print("  ");
			}

			int val2 = row;
			if (row == n) {
				val2 = val2 - 1;
				nst2 = nst2 - 1;
			}
			for (int i = 1; i <= nst2; i++) {
				System.out.print(val2 + " ");
				val2--;
			}

			nsp -= 2;
			nst1++;
			nst2++;
			row++;
			System.out.println();

		}

	}

}
