//Given an array A of positive integers. Your task is to find the 
//leaders in the array. An element of array is leader if it is greater than or equal to
//all the elements to its right side. The rightmost element is always a leader. 
//
//Example 1:
//
//Input:
//n = 6
//A[] = {16,17,4,3,5,2}
//Output: 17 5 2
//Explanation: The first leader is 17 
//as it is greater than all the elements
//to its right.  Similarly, the next 
//leader is 5. The right most element 
//is always a leader so it is also 
//included.
//
//Example 2:
//
//Input:
//n = 5
//A[] = {1,2,3,4,0}
//Output: 4 0

package practice;

import java.util.Scanner;
public class leaders_of_an_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int min=0;
		int[] arr1=new int[n];
		for (int i = 0; i < n; i++) {
			int j;
			for( j=i+1;j<n;j++)
			{
				if(arr[i]<=arr[j])
				{
					break;
				}
				
			}
			if(j==n)
				System.out.println(arr[i]);
		}
	}
}
