package Lecture1;

public class Pattern5 {
	public static void main(String[] args) {
		int row = 5;
		int nst = 5;
		int nsp = 0;

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < nsp; j++) {
				System.out.print("  ");
			}
			
			for (int j = 0; j < nst; j++) {
				System.out.print("* ");
			}

			nst=nst-1;
			nsp=nsp+2;
			System.out.println();
		}

	}

}
