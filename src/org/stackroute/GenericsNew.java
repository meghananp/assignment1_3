package org.stackroute;

public class GenericsNew implements Comparable{
	
	public static <T extends Comparable <T>> T findMax(T a, T b)
	{
		int n=a.compareTo(b);
		if(n<0){
			return b;
		}
		else{
			return a;
		}
	}
	
	public static void main(String args[])
	{
		System.out.println(findMax(2,3));
		System.out.println(findMax('a','d'));
		System.out.println(findMax("meghana","chandu"));
		//what if we try to do this with a data type which 
		//doesn't have this method
		
		GenericsNew k =new GenericsNew();
		System.out.println(findMax(k,k));
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
