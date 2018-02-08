package org.stackroute;

import java.util.*;

public class GuessNumber {
	Scanner scan=new Scanner(System.in);
	int max=100;
	
	public void playGame()
	{
		Random rand=new Random();
		int randomNo=Math.abs(rand.nextInt())%(max+1);
		
		while(true)
		{
			int input=scan.nextInt();
		
			if(input>randomNo)
			{
				System.out.println("Number is too big");		
			}
				
			else if(input<randomNo)
			{
				System.out.println("Number is too small");				
			}
				
			else{
				System.out.println("You got it");
				break;
			}
		}
		
	}
	
	public static void main(String args[])
	{
		GuessNumber game=new GuessNumber();
		game.playGame();
	}

}
