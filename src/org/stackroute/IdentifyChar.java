package org.stackroute;

import java.util.Scanner;

public class IdentifyChar {
	public static void main(String args[])
	{
		System.out.println("Enter a character:");
		Scanner scan=new Scanner(System.in);
		char input=scan.next().charAt(0);
		
		int check=input;
		
		if((check>=65)&&(check<=90))
			System.out.println("Capital letter");
		else if((check>=97)&&(check<=122))
			System.out.println("Small letter");
		else if((check>=48)&&(check<=57))
			System.out.println("Small letter");
		else
			System.out.println("Special Character");
		
	}

}
