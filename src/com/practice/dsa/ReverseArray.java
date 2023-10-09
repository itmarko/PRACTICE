//Reverse the array
package com.practice.dsa;

public class ReverseArray {
	
	static void reverseArray(int arr[], int start, int end) {
		  int temp;
		  if(start>=end)
			  return;
		  temp= arr[start];
		  arr[start] = arr[end];
		  arr[end] = temp;
		  
		  reverseArray(arr, start+1, end-1);
		
	}
	
	static void PrintArray(int arr[], int n){
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		
		reverseArray(arr,0,arr.length-1);
		PrintArray(arr, arr.length);
	}

	
}