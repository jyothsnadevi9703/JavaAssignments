package Assignment_1;

import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int principle;
		int interest;
		int time;
		System.out.println("Enter principle, interest, time:");
		Scanner sc=new Scanner(System.in);
		principle=sc.nextInt();
		interest=sc.nextInt();
		time=sc.nextInt();
		int si=(principle*interest*time)/100;
		System.out.println("Interest:"+si);
	}
}

	

