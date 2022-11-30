package StringExample;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any string:");
		String name;
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		int length=name.length();
		String newname="";
		for (int i=length-1;i>=0;i--)
		{
			char value=name.charAt(i);
			newname=newname+value;
		}
		System.out.println(newname);
		
		
		
		
		
	}

}
