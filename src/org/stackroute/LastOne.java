package org.stackroute;

import java.util.Scanner;

public class LastOne {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String newStr="";
		
		int n=scan.nextInt();
		int len=str.length();
		
		for(int i=len-n;i<len;i++)
		{	
			
			newStr=newStr+str.charAt(i);
		}
		
		System.out.print(str);
		for(int j=0;j<n;j++)
		{
			System.out.print(newStr);
		}
	}

}
