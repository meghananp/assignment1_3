package org.stackroute;

import java.util.Scanner;

public class Repeat {
	public static void main(String args[])
	{
		System.out.println("Enter the number:");
		Scanner scan=new Scanner(System.in);
		int input=scan.nextInt();
		
		for(int i=1;i<=input;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.println(i);
			}
		}
	}

}
