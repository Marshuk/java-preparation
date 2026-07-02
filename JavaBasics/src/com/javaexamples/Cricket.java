package com.javaexamples;

public class Cricket {
	static int countrycode=999;
	static String countryname="india";
	int jerseyno;
	String player;
	
	

	public static void main(String[] args) 
	{
		System.out.println("player 1 info:");
		Cricket msd = new Cricket();
		msd.jerseyno=7;
		msd.player="mahendera singh Dhoni";
		System.out.println("country code:"+countrycode);
		System.out.println("country name:"+countryname);
		System.out.println("jersey no:"+msd.jerseyno);
		System.out.println("player name:"+msd.player);
		
		
		System.out.println("player 2 info:");
		Cricket virat = new Cricket();
		virat.jerseyno=18;
		virat.player="virat kohli";
		System.out.println("country code:"+countrycode);
		System.out.println("country name:"+countryname);
		System.out.println("jersey no:"+virat.jerseyno);
		System.out.println("player name:"+virat.player);
		
		
		System.out.println("player 3 info:");
		countrycode = 6666;
		countryname = "bhharat";
		Cricket kl = new Cricket();
		kl.jerseyno=4;
		kl.player="Rahul";
		System.out.println("country code:"+countrycode);
		System.out.println("country name:"+countryname);
		System.out.println("jersey no:"+kl.jerseyno);
		System.out.println("player name:"+kl.player);
		
		
		
		
		
		

		


		
		
		
		
		// TODO Auto-generated method stub

	}

}
