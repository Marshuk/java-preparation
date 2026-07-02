package com.javaexamples;

public class Cricketplayer {
	static String teamName;
	String playername;
	int runs;

	public static void main(String[] args) {
		System.out.println("player 1 info:");
		Cricketplayer p1 = new Cricketplayer();	
		teamName = "india";
		p1.playername="Dhoni";
		p1.runs = 150;
		System.out.println(teamName);
		System.out.println(p1.playername);
		System.out.println(p1.runs);



		
		System.out.println("player 2 info:");
		Cricketplayer p2 = new Cricketplayer();	
		p2.playername="Rohith";
		p2.runs = 100;
		System.out.println(teamName);
		System.out.println(p1.playername);
		System.out.println(p1.runs);

		System.out.println("player 3 info:");
		teamName = "South africa";
		p1.playername="Ab devillius";
		p1.runs = 110;
		System.out.println(teamName);
		System.out.println(p1.playername);
		System.out.println(p1.runs);


		

		// TODO Auto-generated method stub

	}

}
