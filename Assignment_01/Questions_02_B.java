package com.sunbeam.Assignment_01;

import java.util.Scanner;

public class Questions_02_B {
	
	public static int binarySearch(int arr[], int key)
	{
		int left = 0;
		int right = arr.length-1;
		int mid = 0;
		int count=0;
		while(left<=right)
		{
			mid = (left+right)/2;
			count++;
			if(key == arr[mid])
				return count;
			
			else if(key<arr[mid])
				right = mid -1;
			
			else 
				left = mid+1;
		}
		return -1;
	}
	

	public static void main(String[] args) {
			int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter key :- ");
			int key = sc.nextInt();
			
			int i = binarySearch(arr,key);
			
			if(i!=-1)
				System.out.println("Key is found successfully after  :- "+i+" comparisions");
			else
				System.out.println("Key is not found ");
	}
}
