package Lecture5;

public class MaximumCircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, -2, 3, 4, -5, 6, -20, -10, 13 };
//		int[] arr = {8,-8,9,-9,10,-11,12};
//		int[] arr = {-10,1,2,3,-10};
		System.out.println(Math.max(kadanes(arr), sumA(arr) - minSubSum(arr)));

	}

	public static int kadanes(int[] arr) {
		int min = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			min = Math.max(sum, min);
			if (sum < 0)
				sum = 0;
		}
		return min;
	}

	public static int sumA(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	public static int minSubSum(int[] arr) {
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			min = Math.min(sum, min);
			if (sum > 0)
				sum = 0;
		}
		return min;
	}

}
