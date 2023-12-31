package practice;

/*
 *  rotate the array to the right by k steps
 *  
 *  input:{1,2,3,8,9,10} k=3
 *  output= [8,9,10,1,2,3]
 *  
 *  k=2
 *  [9 10 1 2 3 8]
 * */
//public class RotateAnArrayByKSteps {
//	public static void rotate(int[] arr, int k) {
//		int j = 0;
//
//		while (k > 0) {
//			int temp = arr[arr.length - 1];
//			for (j = arr.length - 1; j > 0; j--) 
//			{
//				arr[j] = arr[j - 1];
//			}
//			arr[j] = temp;
//			k--;
//		}
//		for (int i = 0; i < arr.length; i++) 
//		{
//			System.out.print(arr[i] + " ");
//		}
//	}
//	public static void main(String[] args) 
//	{
//		int arr[] = { 1, 2, 3, 8, 9, 10 };
//		int k = 2;
//		rotate(arr, k);
//	}
//}

public class RotateAnArrayByKSteps {
	public static void rotate(int[] arr, int k) {
		int j = arr[arr.length-1];

		while (k > 0) {
			int temp = arr[0];
			for (j = 0; j < arr.length-1; j++) 
			{
				arr[j] = arr[j+1];
			}
			arr[j] = temp;
			k--;
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) 
	{
		int arr[] = { 1, 2, 3, 8, 9, 10 };
		int k = 2;
		rotate(arr, k);
	}
}

