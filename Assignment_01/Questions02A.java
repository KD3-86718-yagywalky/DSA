package com.sunbeam.Assignment_01;

import java.util.Scanner;

public class Questions02A {

	public static void main(String[] args) {
		
		int[] arr = {88, 33, 66, 99, 11, 77,88, 22, 55, 14,88,25,75,6,5,85,87};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key :- ");
		int key = sc.nextInt();
		linear_search(arr,key);
	}
	
	public static void linear_search(int arr[],int key)
	{
		int index = 0;
		for(int i =0 ; i<arr.length-1;i++)
		{
			if(arr[i]==key)
				index = i;
		}
		if(index ==0)
			System.out.println("Key is not Found ........");
		else
		System.out.println("Index is found :- "+(++index));
	}
}