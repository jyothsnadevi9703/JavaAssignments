package Assignment_1;

import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
		
		
		System.out.println("Enter principle,rate, time :");
		Scanner sc=new Scanner(System.in);
		int principle=sc.nextInt();
		int rate=sc.nextInt();
		int time=sc.nextInt();
		
		int Arr[] = new int[3];
		
		Arr[0]= principle;
		Arr[1]= rate;
		Arr[2]= time;
		
		int si=(Arr[0]*Arr[1]*Arr[2])/100;
		System.out.println("Interest: "+si);
	}
}

	

