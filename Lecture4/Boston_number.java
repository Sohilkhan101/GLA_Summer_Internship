package Lecture4;

public class Boston_number {
	public static void main(String[] args) {
		int n=85;
		int sum1 = sum(n);
		System.out.println(sum1);
		int sum2 = sumprimefactors(n);
		System.out.println(sum2);
		if(sum1==sum2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

	private static int sumprimefactors(int n) {
		int ans=0;
		for(int i = 2; i<= n; i++) {
	         while(n%i == 0) {
	            ans=ans+sum(i);
	            n = n/i;
	         }
		}
		return ans;
		
	}

	private static int sum(int n) {
		int ans=0;
		while(n!=0) {
			int rem=n%10;
			ans=ans+rem;
			n=n/10;
		}
		return ans;
	}
	

}
