package Assignment2;

public class splitWords {
	
	public static void main(String args[])
	{
		String str="select * from ipl.csv where season > 2014 and city = 'Bangalore'";
		String strArr[]=str.split(" ");
		
		for(int i=0;i<strArr.length;i++)
		{
			System.out.println(strArr[i]);
		}
	}

}
