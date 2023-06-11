package Lecture3;

public class ChewNum {
	public static void main(String[] args) {
		int n = 4545;
		int ans = 0;
		int mul = 1;
		while (n > 9) {
			int rem = n % 10;
			if (rem >= 5) {
//				int num=9-rem;
				ans = ans + (9 - rem) * mul;
			} else {
				ans = ans + rem * mul;
			}
			mul = mul * 10;
			n /= 10;
		}

		if (n >= 5 && n != 9) {
			ans = ans + (9 - n) * mul;
		} else {
			ans = ans + n * mul;
		}
		System.out.println(ans);

	}

}
