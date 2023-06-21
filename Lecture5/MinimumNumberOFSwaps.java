package Lecture5;
import java.util.Arrays;

public class MinimumNumberOFSwaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,8,5,4};
		System.out.println(minSwaps(arr));

	}
	
	public static int minSwaps(int[] arr)
	{
		int[] temp = Arrays.copyOfRange(arr, 0, arr.length);
		
		Arrays.sort(temp);
		int i = 0;
		int count = 0;
		while(i < arr.length-1)
		{
			if(arr[i]==temp[i])
			{
				i++;
			}
			else
			{
				int loc = binarySearch(temp,arr[i]);
				swap(arr, i, loc);
				count++;
			}
		}
		return count;
		
	}
	
	public static void swap(int[] arr,int a,int b)
	{
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	
	public static int binarySearch(int[] arr,int ele)
	{
		int si = 0;
		int ei = arr.length-1;
		
		while(si <= ei)
		{
			int mid = (si+ei)/2;
			if(arr[mid] == ele)
			{
				return mid;
			}
			else if(arr[mid] > ele)
			{
				ei = mid-1;
			}
			else
			{
				si = mid+1;
			}
		}
		return -1;
	}

}

