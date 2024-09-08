package com.shoaib.march16;

public class UseToStringMethod {

	public static void main(String[] args) {
		Player p1 = new Player();
		p1.setPlayerName(7, "MS Dhoni");
//		System.out.println(p1.toString());
		System.out.println(p1);
		
		Player p2 = new Player();
		p2.setPlayerName(18, "Virat Kohli");
//		System.out.println(p2.toString());
		System.out.println(p2);

	}

}
