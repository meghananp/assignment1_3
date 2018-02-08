package org.stackroute;

import java.util.Scanner;

public class AddUndefined {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		//int input=scan.nextInt();
		int sum=0;
		int input;
		
		/*while(scan.hasNext())
		{
			input=scan.nextInt();
			sum=sum+input;
			System.out.println("the sum of input " +sum);
		}*/
		
		String str=scan.nextLine();
		String str_arr[]=str.split(" ");
		
		for(int i=0;i<str_arr.length;i++)
		{
			sum+=Integer.parseInt(str_arr[i]);
		}
		System.out.println(sum);
	}

}
