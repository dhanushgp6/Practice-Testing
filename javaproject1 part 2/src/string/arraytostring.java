package string;

import java.util.Arrays;

public class arraytostring {
	public static void display(int[] a) {
		for(int n:a) {
		System.out.print(n+" ");
		
		}
		}
		
	

	public static void main(String[] args) {
		int arr[]= {2,9,6,4,9};
		display(arr);
		Arrays.sort(arr);
		System.out.println("\n");
		display(arr);
		int[] arr1=new int[5];

		int[] arr2=new int[5];
Arrays.fill(arr1, 5);
		Arrays.fill(arr2, 5);
		System.out.println("\n");

		display(arr1);
		
		

		
		
		
	}
	
	
}
