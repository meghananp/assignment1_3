package org.stackroute;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortReverse {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the number of elements you want in the array");
		int n=scan.nextInt();
		Integer[] arr=new Integer[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();		
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				sum=sum+arr[i];
		}
		if(sum>15)
			System.out.println("True");
		else
			System.out.println("False");
		
	}

}
