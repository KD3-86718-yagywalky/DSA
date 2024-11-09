package com.assignment_02;

import java.util.Arrays;

public class Question_01 {
	
	public static void main(String[] args) {
		 
		int[] arr = {55, 44, 22, 66, 11, 33};
		
		System.out.println(Arrays.toString(arr));
		
		insertionSorting(arr,arr.length);
		System.out.println(Arrays.toString(arr));

	}

	public static void insertionSorting(int[] arr, int N) {
		
		for(int i = 1; i<N;i++) {
			
			int temp = arr[i];
			
			int j;
			for(j = i-1;j>-1 && arr[j]<temp; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1]=temp;
		}
	}
		
		
	}


