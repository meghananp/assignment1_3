package Assignment2;

public class AndOr {
	
	public static void main(String args[])
	{
		String str="select season,winner,player_match  from ipl.csv where season > 2014 and city ='Bangalore' or date > '31-12-2014';";
		String str1=str.replace(";","");
		String str2=str1.replaceAll("\\s+", " ");
		String strArr[]=str2.split("[, ]");
		
		for(int i=0;i<strArr.length;i++)
		{
			//System.out.println(strArr[i]);
			if((strArr[i].equals("and"))||(strArr[i].equals("or")))
			{
				System.out.println(strArr[i]);
			}
		}
	}

}
