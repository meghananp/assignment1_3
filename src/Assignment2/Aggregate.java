package Assignment2;

public class Aggregate {
	public static void main(String args[])
	{
		String str="select avg(win_by_wickets),min(win_by_runs) from ipl.csv;";
		String str1=str.replace(";","");
		String str2=str1.replaceAll("\\s+", " ");
		String strArr[]=str2.split("[, ]");
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

}
