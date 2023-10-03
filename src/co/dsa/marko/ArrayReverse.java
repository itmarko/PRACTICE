//Reverse The array 
package co.dsa.marko;


public class ArrayReverse {
	static void reverseArray(int arr[],int start,int end){
		int temp;
		//		while(start <end){
		//			temp = arr[start];				//Iterative java program to reverse an
		//			arr[start] = arr[end]; 			Time complexity O(n) // Auxiliary Space: O(1)
		//			arr[end] = temp;
		//			start++;
		//			end--;
		//		}
		if(start>=end) {
			return;
		}
		temp = arr[start];				//Recursive Java Program to reverse an array
		arr[start]=arr[end];			//Time complexity O(1) Auxiliary Space: O(n), due to recursive call stack
		arr[end]=temp;
		reverseArray(arr, start+1, end-1);
		
	}
	
	static void printArray(int arr[], int n) {
		for(int i=0; i<n; i++) {	
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		reverseArray(arr, 0, n-1);
		System.out.println("Reverse array is :");
		printArray(arr, n);
	}
}
