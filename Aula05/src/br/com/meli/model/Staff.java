package br.com.meli.model;

public class Staff extends Weapon{

	public Staff() {
		super("Cajado", "Cajado", 50, 15, 12);
	}

	@Override
	public void action() {
		System.out.println("Ataque com "+toString());	
		
	}
	
	@Override
	public String toString() {
		return "Staff " + getName() + ", Type :" + getType() + ", Power :" + getPower()
				+ ", Magic :" + getMagic() + ", Range :" + getRange();
	}

}
