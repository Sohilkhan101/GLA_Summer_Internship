package Lecture5;

import java.util.Scanner;

public class Arrays_Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[5];
//		System.out.println(arr);
//		System.out.println(arr.length);

//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		arr[3]=4;
//		arr[4]=5;

//		for(int i=0;i<arr.length;i++) {
//			arr[i]=i+10;
//		}

//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}

		int[] brr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " ");
		}

//		int [] brr = new int[5];
//		System.out.println(brr);
		add(2, 3);
		sc.close();
	}

	private static void add(int i, int j) {
		System.out.println(i + j);
		System.out.println("7689");

	}

}
