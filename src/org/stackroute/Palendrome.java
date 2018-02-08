package org.stackroute;

import java.util.Scanner;

public class Palendrome {
	
	public static void main(String args[])
	{
		String str,rev="";
		System.out.println("Enter the number:");
		Scanner scan=new Scanner(System.in);
		str=scan.nextLine();
		int x=str.length();
		
		for(int i=(x-1);i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		int x1=Integer.parseInt(rev);
		
		int[] arr=new int[x];
		int i=0;
		int sum=0;
		
		while(x1>0){
			arr[i]=x1%10;
			x1=x1/10;
			//System.out.println(arr[i]);
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
			
			i++;
		}
		
		//System.out.println(sum);
		
		if(str.equals(rev)&&(sum>=25))
			System.out.println(str+"  is palindrome and the sum of even numbers is greater than 25");
		else if(str.equals(rev)&&(sum<25))
			System.out.println(str+" is palindrome and sum of even numbers is less than 25");
		else if(!str.equals(rev))
			System.out.println(str+" is not a palindrome");
	}

}
