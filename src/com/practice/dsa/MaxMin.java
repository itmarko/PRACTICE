//Find the maximum and minimum element in an array using shorting
package com.practice.dsa;



import java.util.Arrays;

class Pair{
	public int min;
	public int max;
}

public class MaxMin {
	
		static Pair getMinMax(int arr[],int n ) {
			Pair minmax = new Pair();
			Arrays.sort(arr);
			minmax.min=arr[0];
			minmax.max=arr[n-1];
			
			return minmax;
		}
	
	

	public static void main(String[] args) {
		int arr[]= {10,50,75,99,2,5};
		
		Pair minmax = getMinMax(arr, arr.length);
		System.out.println("Minimum element is " +minmax.min);
		System.out.println("Maximum element is " +minmax.max);
		
	}

}
