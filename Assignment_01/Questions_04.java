package com.sunbeam.Assignment_01;

import java.util.Scanner;

public class Questions_04 {

	public static void main(String[] args) {
		
		int[] arr = {99,88,77,66,55,44,33,22,11};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter key you want to find :- ");
		int key = sc.nextInt();
		binarysearch(arr,key);
}

	private static void binarysearch(int[] arr, int key) {
		
		int index = 0;
		int left =0;
		int right = arr.length;
		int mid =0;
		
		
		while(left<=right)
		{
			mid = (left+right)/2;
			
			if(arr[mid]==key) {
				System.out.println("Found key at :- " +mid);
				System.out.println("Found key at :- " +arr[mid]);
				index++;
				break;
			}
			
			else if(key>arr[mid]) 
				right = mid-1;
			
			else
				left = mid+1;
		}
		if(index ==0)
		{
			System.out.println("Key is not found .......");
		}
	}

}
