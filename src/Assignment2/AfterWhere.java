package Assignment2;

public class AfterWhere {
	
	public static void main(String args[])
	{
		String str="select * from ipl.csv where season > 2014 and city ='Bangalore'";
		String strArr[]=str.split(" ");
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

}
