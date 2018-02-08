package org.stackroute.assignment2;

import java.util.Scanner;

public class WithSwitch {
	
	public void splitString(String strArr[])
	{
		
		for(int i=0;i<strArr.length;i++)
		{
			System.out.println(strArr[i]);
		}
	}
	
	public void fileName(String strArr[])
	{	
		for(int i=0;i<strArr.length;i++)
		{
			if(strArr[i].equals("from"))
			{
				System.out.println(strArr[i+1]);
			}
		}
	}
	
	public void selectPart(String strArr[])
	{		
		for(int i=0;i<strArr.length;i++)
		{
			
			if(strArr[i].equals("where"))
				break;
			
			System.out.print(strArr[i]+" ");
		}
	}
	
	public void filter(String strArr[])
	{
		int j,h;
		j=h=0;
		
		for(int i=0;i<strArr.length;i++)
		{
			if(strArr[i].equals("where"))
			{
				j=i+1;
				h=i;
			}
		}
		
		for(int k=j;k<strArr.length;k++)
		{
			System.out.print(strArr[k]+" ");
		}
		
        System.out.println();
		
		for(int k=0;k<h;k++)
		{
			System.out.print(strArr[k]+" ");
		}
	}
	
	public void condition(String strArr[])
	{
		int j,h;
		j=h=0;
		
		for(int i=0;i<strArr.length;i++)
		{
			if(strArr[i].equals("where"))
			{
				j=i+1;
			}
			
			if(strArr[i].equals("and"))
			{
				h=i;
			}
				
		}
		
		for(int k=j;k<h;k++)
		{
			System.out.print(strArr[k]+" ");
		}
		
		System.out.println();
		
		for(int k=h+1;k<strArr.length;k++)
		{
			System.out.print(strArr[k]+" ");
		}
	}
	
	public void relationalOperators(String strArr[])
	{
		int n;
		int j=1;
		
		for(int i=0;i<strArr.length;i++)
		{
			if((strArr[i].equals(">"))||(strArr[i].equals("="))||(strArr[i].equals("<"))||(strArr[i].equals(">="))||(strArr[i].equals("<=")))
			{
				System.out.println("Condition "+j);
				System.out.println("variable : "+strArr[i-1]);
				System.out.println("operator : "+strArr[i]);
				System.out.println("value : "+strArr[i+1]);
				j++;
			}
		}
	}
	
	public void selectFields(String strArr[])
	{
		//System.out.print(strArr[1]);
		int j=0;
		
		for(int i=0;i<strArr.length;i++)
		{
			if(strArr[i].equals("from"))
				j=i;
		}
		
		for(int k=1;k<j;k++)
			System.out.println(strArr[k]);
	}
	
	public void groupBy(String strArr[])
	{
		//System.out.print(strArr[1]);
		int j;
		
		for(int i=0;i<strArr.length;i++)
		{
			if(strArr[i].equals("group"))
			{
				System.out.println(strArr[i+2]);
			}
		}
	}
	
	public void orderBy(String strArr[])
	{
		//System.out.print(strArr[1]);
		int j;
		
		for(int i=0;i<strArr.length;i++)
		{
			if(strArr[i].equals("order"))
			{
				System.out.println(strArr[i+2]);
			}
		}
	}
	
	public void aggregate(String strArr[])
	{
		//System.out.print(strArr[1]);
		//int j;
		String s="";
		String v="";
		for(int i=0;i<strArr.length;i++)
		{
			//System.out.println(strArr[i]);
			int a= strArr[i].indexOf('(');
			int b= strArr[i].indexOf(')');
			if(strArr[i].contains("(")){
			for(int j=0;j<a;j++){
				s+=strArr[i].charAt(j);
				
			}
			
			for(int k=a+1;k<b;k++)
			{
				v+=strArr[i].charAt(k);
			}
			System.out.println("Aggregate Name : " +s);
			System.out.println("Aggregate Field : " +v);
			s="";
			v="";
			}
			
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter your choice");
		Scanner scan=new Scanner(System.in);
		Scanner scan1=new Scanner(System.in);
		
		WithSwitch sql=new WithSwitch(); 
		
		System.out.println("Enter your choice:");
		System.out.println("1. Split the string:");
		System.out.println("2. File name:");
		System.out.println("3. Select statement:");
		System.out.println("4. Filter part:");
		System.out.println("5. Display sonditions:");
		System.out.println("6. Relational operators:");
		System.out.println("7. Selecting fields");
		System.out.println("8 Group By");
		System.out.println("9. Order by");
		System.out.println("10. Aggregate");
		
		System.out.println("Enter the query");
		String str=scan1.nextLine();
		String str1=str.replace(";","");
		String str2=str1.replaceAll("\\s+", " ");
		String strArr[]=str2.split("[, ]");
		System.out.println("Enter your choice");
		int choice=scan.nextInt();
		
		switch(choice)
		{
		case 1: sql.splitString(strArr);
		break;
		case 2: sql.fileName(strArr);
		break;
		case 3: sql.selectPart(strArr);
		break;
		case 4: sql.filter(strArr);
		break;
		case 5: sql.condition(strArr);
		break;
		case 6: sql.relationalOperators(strArr);
		break;
		case 7: sql.selectFields(strArr);
		break;
		case 8: sql.groupBy(strArr);
		break;
		case 9: sql.orderBy(strArr);
		break;
		case 10: sql.aggregate(strArr);
		break;
		}
		
	}

}
