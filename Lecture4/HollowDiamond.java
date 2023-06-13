package Lecture4;

public class HollowDiamond {
	public static void main(String[] args) {
		int n = 9;
		int row = 1;
		int nst1 = (n / 2) + 1;
		int nst2 = n / 2;
		int nsp = -1;

		while (row <= n) {

			// star
			for (int i = 1; i <= nst1; i++) {
				System.out.print("*");
			}
			// space
			for (int i = 1; i <= nsp; i++) {
				System.out.print(" ");
			}
			// star
			if(row==n) {
				nst2--;
			}
			for (int i = 1; i <= nst2; i++) {
				System.out.print("*");
			}
			if (row <= n / 2) {
				nst1--;
				if (row != 1) {
					nst2--;
				}
				nsp = nsp + 2;
			} else {
				nst1++;
				nst2++;
				nsp = nsp - 2;
			}
			row++;
			System.out.println();

		}

	}

}
