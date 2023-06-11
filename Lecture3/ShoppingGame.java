package Lecture3;

import java.util.Scanner;

public class ShoppingGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int ap = sc.nextInt();
			int hp = sc.nextInt();

			int i = 1;
			while (true) {
				ap = ap - i;
				if (ap >= 0) {
					i++;
				} else {
					System.out.println("Harshit");
					break;
				}

				hp = hp - i;
				if (hp >= 0) {
					i++;
				} else {
					System.out.println("Aayush");
					break;
				}
			}

		}
		sc.close();
	}

}
