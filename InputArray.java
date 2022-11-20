package InputFromUserArray;

import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int n=sc.nextInt();
		int[]myarray=new int[n];
		System.out.println("enter the elements");
		for (int i=0;i<n;i++)
		{
			myarray[i]=sc.nextInt();
		}
		System.out.println("Array values are");
		for (int i=0;i<n;i++)
		{
			System.out.println(myarray[i]);
		}
		int sum=0;
		for (int i=0;i<n;i++)
		{
			sum=sum+myarray[i];
		}
		System.out.println("sum of the element is"+sum);
		

	}

}
