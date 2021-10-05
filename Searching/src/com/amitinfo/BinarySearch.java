package com.amitinfo;

import java.util.Arrays;

public class BinarySearch {
	
	public static int iterativeBinarySearch(int [] arr, int key) {
		int left = 0;
		int right = arr.length - 1;
		while( left <= right ){
		    int mid = ( left + right ) / 2 ;
		    if( key == arr[ mid ])
		        return mid;
		    else if( key > arr[ mid ] )
		        left = mid + 1;
		    else
		        right = mid - 1;
		}
		return -1;
	}
		
	public static int recursiveBinarySearch(int[] arr, int left, int right, int key) {
		if( left > right )
			return -1;
		int mid = ( left + right ) / 2;
		if( key == arr[ mid ] )
			return mid;
		else if( key > arr[ mid ] )
			return recursiveBinarySearch(arr, mid + 1, right, key);
		else
			return recursiveBinarySearch(arr, left, mid - 1, key);
	}
	
	public static void main(String[] args) {
	
		int arr[] = new int[] {2,4,10,23,11,12,1,6,5};
		
		System.out.print("Before Sorting ");
		for (int i : arr) 
			System.out.print(i + " ");
		
		int key = 10;		
		Arrays.sort(arr);
		System.out.println();
		System.out.print("After Sorting ");

		for (int i : arr) 
			System.out.print(i + " ");
		
		System.out.println();		
//		int index = BinarySearch.iterativeBinarySearch(arr,key);
		int index = BinarySearch.recursiveBinarySearch(arr,0,arr.length,key);
		
		if(index == -1)
			System.out.println("Element not found");
		else
			System.out.println(key + " Element found at index " + index);
	
	}
	
}
