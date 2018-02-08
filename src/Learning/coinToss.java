package Learning;
import java.util.Random;

public class coinToss {
	
	public int tossCoin()
	{ 
		Random rand=new Random();
		int toss=Math.abs(rand.nextInt())%2;
		return toss;	
	}
	
	public static void main(String args[])
	{
		coinToss game=new coinToss();
		int cnt1,cnt2;
		cnt1=cnt2=0;
		
		for(int i=0;i<10;i++)
		{
			if(game.tossCoin()==0)
				cnt1++;
			else
				cnt2++;	
		}		
		System.out.println(cnt1+" "+cnt2);
		System.out.println(Math.abs(3%5));
	}

}
