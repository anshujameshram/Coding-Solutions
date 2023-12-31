import java.util.Scanner;

//Equilibrium Point in an array is a position such that the sum of elements
//before it is equal to the sum of elements after it.
//Example 1:
//
//Input: 
//n = 5 
//A[] = {1,3,5,2,2} 
//Output: 3
//Explanation:  
//equilibrium point is at position 3 
//as elements before it (1+3) = 
//elements after it (2+2). 
// 
//
//Example 2:
//
//Input:
//n = 1
//A[] = {1}
//Output: 1
//Explanation:
//Since its the only element hence
//its the only equilibrium point.


public class equilbrium_point {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter elements:");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int lsum=0,rsum=0;
		for(int i=0;i<n;i++)
		{
			lsum=0;
			for(int j=0;j<i;j++)
			{
				lsum=lsum+arr[j];
			}
			
			rsum=0;
			for(int j=i+1;j<n;j++)
			{
				rsum=rsum+arr[j];
			}
			
			if(lsum==rsum)
			{
				System.out.print((i+1)+" ");
				System.out.println(lsum+" "+rsum);
				break;
			}
		}
		
		//System.out.println(lsum+" "+rsum);
		if(lsum!=rsum)
		{
			System.out.print("-1");
		}
	}

}
