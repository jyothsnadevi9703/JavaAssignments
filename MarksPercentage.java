package Markspercentage;

import java.util.Scanner;

public class MarksPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of subjects");
		int n=sc.nextInt();
		int[]subject=new int[n];
		System.out.println("Enter the Marks");
		for (int i=0;i<n;i++)
		{
			subject[i]=sc.nextInt();
		} 
		System.out.println("Marks are");
		for (int i=0;i<n;i++)
		{
			System.out.println(subject[i]);
		}
		int sum=0;
		for (int i=0;i<n;i++)
		{
			sum=sum+subject[i];
		}
		int percentage = ((sum/n*100)*100);
//		double percentage[]=new double[(sum/n*100)*100];
		System.out.println("Percentage of Marks- "+ percentage);
		System.out.print("Average of Marks- "+sum/n);

	}

}