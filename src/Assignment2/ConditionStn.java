package Assignment2;

public class ConditionStn {
	public static void main(String args[])
	{
		String str="select * from ipl.csv where season > 2014 and city = 'Bangalore'";
		String strArr[]=str.split(" ");
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

}
