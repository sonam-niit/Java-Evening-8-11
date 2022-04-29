package com.simplilearn.arrayrotation;

class RotateArray {
	
	public void rotate(int nums[], int k) {
		
		//if rotate number is greater then number of elements
		if (k > nums.length)
			k = k % nums.length;
		//now we got actual number of rotations
		
		int temp[] = new int[nums.length];// create new array with the size of given array
		
		for (int i = 0; i < k; i++) {
			temp[i] = nums[nums.length - k + i];
		}
		int j = 0;
		for (int i = k; i < nums.length; i++) {
			temp[i] = nums[j];
			j++;
		}
		System.arraycopy(temp, 0, nums, 0, nums.length);
	}
}