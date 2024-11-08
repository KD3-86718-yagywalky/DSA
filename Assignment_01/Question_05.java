package com.sunbeam.Assignment_01;

import java.util.Scanner;

public class Question_05 {

	public static void main(String[] args) {
		
		int[] arr = {2,1,5,2,0,4,5,8,4,2,1,5,4,2,1,5,6,22,5,2,4,56,2};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key :- ");
		int key = sc.nextInt();
		System.out.print("Enter Occurence :- ");
		int occ = sc.nextInt();
		linearSrearch(arr, key, occ);
	}

	private static void linearSrearch(int[] arr, int key, int occ) {
		
		int index = 1;
		
		for(int i =0; i<arr.length;i++)
		{
			if(arr[i]==key && occ==index)
			{
				System.out.println("Element of found at :- "+i);
				index=-1;
				break;
			}
			else if(arr[i]==key)
					index++;
		}
		if(index>=0)
			System.out.println("-1");
		
	}

}
