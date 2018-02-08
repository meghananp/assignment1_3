package org.stackroute;

import java.util.Scanner;

public class VowelConsonant {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter something:");
		
		if(scan.hasNextInt()||scan.hasNextFloat()||scan.hasNextDouble())
			System.out.println("Plase enter a string");
		
		else
		{
			String input=scan.nextLine();
			int len=input.length();
			
			for(int i=0;i<len-1;i++)
			{
				char character=input.charAt(i);
				
				if(character=='a'||character=='A'||character=='e'||character=='E'||character=='I'||character=='i'||character=='o'||character=='O'||character=='u'||character=='U')
					System.out.println(character+" a vowel");
				else
					System.out.println(character+" a consonent");
				
			}
			
		}
	}

}
