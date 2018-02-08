package org.stackroute;

import java.util.Scanner;

public class POwerFour {
	
	public static boolean checkPowFour(int input)
	{
		if(input==0)
			return false;
		
		while(input!=1)
		{
			if(input%4!=0)
				return false;
			input=input/4;
		}
		
		return true;
		
	}
	
	public static void main(String args[])
	{
		int ip;
		System.out.println("Enter a power of four:");
		Scanner scan=new Scanner(System.in);
		ip=scan.nextInt();
		
		boolean x = checkPowFour(ip);
		
		if(x==true)
			System.out.println("Yes it's power of four");
		else
			System.out.println("No it's not a power of four");
	}

}
