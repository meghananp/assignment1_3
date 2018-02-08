package org.stackroute;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[])
	{
		String str,rev="";
		System.out.println("Enter the string you want to reverse:");
		Scanner scan=new Scanner(System.in);
		str=scan.nextLine();
		int x=str.length();
		
		for(int i=(x-1);i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
