package com.sunbeam.Assignment_01;

import java.util.Scanner;

public class Question_07 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 15, 3, 4, 4, 1 };
		Scanner sc =new Scanner(System.in);
		int key=sc.nextInt();
		linearSearch(arr,key);
		
	}
	private static void bubbleSort(int[] arr, int N) {
		for(int i = 1; i<N;i++) {
			for(int j=0;j<N-i;j++) {
				if(arr[j + 1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
	}
	private static void linearSearch(int[] arr, int key) {
		int index =0;
		bubbleSort(arr,arr.length);
		for(int i=arr.length-1; i>-1; i--)
		{
			if(arr[i]==key) {
				System.out.println("Rank of "+arr[i]+" is : "+(++i));
				break;
			}
		}
		
		
	}

}
