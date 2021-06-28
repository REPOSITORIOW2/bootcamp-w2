package br.com.meli.model;

public class Sword extends Weapon{
	

	public Sword() {
		super("Espada", "Espada", 50, 0, 1);
	}

	@Override
	public void action() {
		System.out.println("Ataque com "+toString());
		
	}

	@Override
	public String toString() {
		return "Sword "+ getName() + ", Type :" + getType() + ", Power :" + getPower()
				+ ", Magic :" + getMagic() + ", getRange :" + getRange();
	}
	
	

}
