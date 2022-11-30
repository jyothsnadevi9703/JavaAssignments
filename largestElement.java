package InputFromUserArray;

import java.util.Scanner;

public class largestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int n=sc.nextInt();
		int[]myarray=new int[n];
		System.out.println("enter the elements");
//		for (int i=0;i<n;i++)
//		{
//			myarray[i]=sc.nextInt();
//		}
		int max=myarray[0];
		for (int i=0;i<myarray.length;i++)
		{
			if(myarray[i]>max)
			{
				max=myarray[i];
			}
			
		}
		System.out.println("largest element is: "+max);
		

	}

}
