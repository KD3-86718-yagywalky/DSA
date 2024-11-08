package com.sunbeam.Assignment_01;

import java.util.Scanner;

public class Question_06 {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } ;
		Scanner sc = new Scanner(System.in);

		NonRepeatingElement(arr);
	}

	private static void NonRepeatingElement(int[] arr) {
		
		
		
		for(int i = 0; i<arr.length;i++)
		{
			int index = 0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && j!=i) {
					index++;
					break;
				}
				
			}
			if(index==0) {
			System.out.println("Element found :- "+arr[i]);
			break;
		}}
		
	}

}
