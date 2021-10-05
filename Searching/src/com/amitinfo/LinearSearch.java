package com.amitinfo;

public class LinearSearch {
	
	public static int linearSearch(int [] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == key)
				return i;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int arr[] = new int[] {2,4,10,23,11,12,1,6,5};
		int key = 10;
		
		int index = LinearSearch.linearSearch(arr,key);
		
		if(index == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index " + index);
	}
	
	
}
