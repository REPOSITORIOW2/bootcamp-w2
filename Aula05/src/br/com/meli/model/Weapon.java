package br.com.meli.model;

public abstract class Weapon {
	
	private String name;
	private String type;
	private int power;
	private int magic;
	private int range;

	public Weapon() {
		// TODO Auto-generated constructor stub
	}

	public Weapon(String name, String type, int power, int magic, int range) {
		this.name = name;
		this.type = type;
		this.power = power;
		this.magic = magic;
		this.range = range;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	
	public abstract void action();

}
