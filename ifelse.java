package ifelse;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		System.out.println("Enter the numbers:");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		if (num1<num2)
		{
			System.out.println(num1+" is small");
		}
		else
		{
			System.out.println(num2+" is small");
		}

	}

}
