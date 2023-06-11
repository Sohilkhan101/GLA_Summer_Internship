package Lecture3;

public class HourGlass {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nsp = 0;
		int nst1 = n + 1;
		int start = n;
		int nst2 = n;
		while (row <= (2 * n) + 1) {

			for (int i = 1; i <= nsp; i++) {
				System.out.print("  ");
			}
			int val = start;
			for (int i = 1; i <= nst1; i++) {
				System.out.print(val + " ");
				val--;
			}

			int val2 = 1;
			for (int i = 1; i <= nst2; i++) {
				System.out.print(val2 + " ");
				val2++;
			}

			if (row <= n) {
				nst2--;
				nst1--;
				start--;
				nsp++;
			} else {
				nst2++;
				nst1++;
				start++;
				nsp--;
			}
			row++;
			System.out.println();

		}

	}

}
