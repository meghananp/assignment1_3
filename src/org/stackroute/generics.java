package org.stackroute;

public class generics {
	
	public static <E> void printArray(E[] array)
	{
		for(E elements:array)
		{
			System.out.println(elements+" ");
		}
	}
	
	public static void main(String args[])
	{
		Integer[] arr={1,2,3,4,5};
		String[] shopList={"Banana","Apple","Orange"};
		printArray(shopList);
		printArray(arr);
		
	}

}
