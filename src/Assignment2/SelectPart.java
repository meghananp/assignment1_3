package Assignment2;

public class SelectPart {
	
	public static void main(String args[])
	{
		String str="select * from ipl.csv where season > 2014 and city ='Bangalore';";
		String strArr[]=str.split(" ");
		
		for(int i=0;i<strArr.length;i++)
		{
			
			if(strArr[i].equals("where"))
				break;
			
			System.out.print(strArr[i]+" ");
		}
	}

}
