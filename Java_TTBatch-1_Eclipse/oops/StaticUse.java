package com.dit.java.oops;

class Enemy {
	private String name;
	private int attack;
	private boolean weapon;
	static int counter; // 0
	
	Enemy(String name, int attack, boolean weapon)
	{
		this.name = name;
		this.attack = attack;
		this.weapon = weapon;
		counter++; // 1, 2, ...., 10
		System.out.println("Enemy Created "+counter+" "+name+" "+attack+" "+weapon);
	}
}

public class StaticUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		main(null);

		for(int i = 1; i <= 10; i++)
		{
			Enemy obj = new Enemy("L"+i, i, true);
		}
	}
}
