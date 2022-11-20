package ArrayMethods;

import java.util.Scanner;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String value=new String(" JavaProgramming");
		System.out.println(value.charAt(3));
		System.out.println(value.concat("Language"));
		System.out.println(value.length());
		System.out.println(value.substring(4));
		System.out.println(value.substring(4,13));
		System.out.println(value.trim());
		System.out.println(value.replace('a','y'));
		System.out.println(value.toUpperCase());
		System.out.println(value.toLowerCase());
		System.out.println(value.indexOf('o'));
		System.out.println(value.isEmpty());
		System.out.println(value.equalsIgnoreCase("java"));
		System.out.println(value.equals(" JavaProgramming"));

	}

}
