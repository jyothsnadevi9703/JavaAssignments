package DataType;

import java.util.Scanner;

public class Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String name;
		char character;
		double percentage;
		short num2;
		long num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one Int, String, Char, Double, Short, Long Data type ");
		num=sc.nextInt();
		name=sc.next();
		character=sc.next().charAt(0);
		percentage=sc.nextDouble();
		num2=sc.nextShort();
		num3=sc.nextLong();
		System.out.println(num);
		System.out.println(name);
		System.out.println(character);
		System.out.println(percentage);
		System.out.println(num2);
		System.out.println(num3);
		
	}

}
