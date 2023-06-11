package Lecture2;

public class Pattern1C {
	public static void main(String[] args) {
		int n = 7;
		int row = 0;

		int nsp2 = -1;
		int nsp1 = n - 1;
		int nst = 1;
		int start = 1;

		while (row < n) {
			int val1 = start;

			for (int i = 1; i <= nsp1; i++) {
				System.out.print("  ");
			}
			for (int i = 1; i <= nst; i++) {
				System.out.print(val1 + " ");
				val1--;
			}

			for (int i = 1; i <= nsp2; i++) {
				System.out.print("  ");
			}
			int val2 = val1 + 1;
			if (row != 0 && row != n - 1)
				for (int i = 1; i <= nst; i++) {
					System.out.print(val2 + " ");
					val2++;
				}

			if (row < n / 2) {
				nst++;
				nsp1 -= 2;
				nsp2 += 2;
				start++;
			}else {
				nst--;
				nsp1 += 2;
				nsp2 -= 2;
				start--;
			}

			System.out.println();
			row++;
		}
	}

}
