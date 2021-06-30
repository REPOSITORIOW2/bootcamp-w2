package br.com.meli;

public class Arc extends Weapon {

	public Arc() {
		super("Arco", "Arco", 50, 0, 20);
	}

	@Override
	public void action() {
		System.out.println("Ataque com " + toString());
	}

	@Override
	public String toString() {
		return "Arc " + getName() + ", Type :" + getType() + ", Power :" + getPower()
				+ ", Magic :" + getMagic() + ", Range :" + getRange();
	}
}