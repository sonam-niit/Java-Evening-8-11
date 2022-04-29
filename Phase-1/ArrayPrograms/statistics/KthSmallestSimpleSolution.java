package com.simplilearn.statistics;

import java.util.Arrays;

public class KthSmallestSimpleSolution {

	public static int kthSmallest(int arr[],int k) {
		
		//sort them 
		Arrays.sort(arr);
		
		//find out kth smallest and return
		
		return arr[k-1];
	}
	
	public static void main(String[] args) {
		
		int array[]= {7,10, 4, 3, 20, 25};
		
		System.out.println("5th smallest elemet: "+ kthSmallest(array, 5));
	}
}
