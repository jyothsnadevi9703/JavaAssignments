package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Which operation you want to perform?");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if (input.equalsIgnoreCase("addition"))
		{
			System.out.println(num1+num2);
			
		}
		if (input.equalsIgnoreCase("addition"))
		{
			System.out.println(num1+num2);
			
		}
		if (input.equalsIgnoreCase("subtraction"))
		{
			System.out.println(num1-num2);
			
		}
		if (input.equalsIgnoreCase("multiplication"))
		{
			System.out.println(num1*num2);
			
		}
		if (input.equalsIgnoreCase("division"))
		{
			System.out.println(num1%num2);
			
		}
				
	

	}

}
