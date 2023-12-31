

/*
 *   find majority element in an array
 *   given an array of integers,find the majority element.
 *   
 *   the majority element is the element that appears more than n/2 times
 *   (where n is the size of the array)
 *   
 *   for ex-
 *   input: [3,3,2,2,3,2,3]
 *   output-3     //3 appears 4 times
 *   
 *   intput-[1,1,4,1,4,4,1,4,4]
 *   output- 4    //4 appears 5 times
 */
package practice;

import java.util.Scanner;
public class majorityElement {
	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int len=size/2;
		//System.out.println("length/2="+len);
		int index=-1;
		for (int i=0;i<size;i++)
		{
			int count=0;
			for(int j=0;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>len)
			{
				index=i;
			}
		}
		System.out.println(arr[index]);
		//System.out.println("Count="+count);

	}

}
