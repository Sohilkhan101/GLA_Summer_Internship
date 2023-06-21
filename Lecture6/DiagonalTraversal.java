package Lecture6;

import java.util.ArrayList;
import java.util.Collections;

public class DiagonalTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		diagonalT(arr);

	}

	public static void diagonalT(int[][] arr) {
		int i = arr.length - 1;
		int j = 0;
		for (int k = 1; k <= arr.length + arr[0].length - 1; k++) {
			ArrayList<Integer> al = new ArrayList<>();
			int r = i;
			int c = j;
			while (r <= arr.length - 1 && c <= arr[0].length - 1) {
//				System.out.print(arr[r][c]+" ");
				al.add(arr[r][c]);
				r++;
				c++;
			}
			if (k % 1 != 0)
				System.out.println(al);
			else {
				Collections.reverse(al);
				System.out.println(al);
			}
			if (i != 0) {
				i--;
			} else {
				j++;
			}
		}

	}

}
