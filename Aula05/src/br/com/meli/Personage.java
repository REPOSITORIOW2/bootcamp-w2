package br.com.meli;

public class Personage {

	private String name;
	private int level;
	private String grade;
	private Weapon weapon;
	
	public Personage(String name, int level, String grade) {
		super();
		this.name = name;
		this.level = level;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
}
