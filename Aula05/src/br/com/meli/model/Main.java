package br.com.meli.model;

public class Main {

	public static void main(String[] args) {
		Personage personageA = new Personage("Guerreiro", 50, "Guerreiro");
		personageA.setWeapon(new Sword());
		
		Personage personageB = new Personage("Mago", 50, "Mago");
		personageB.setWeapon(new Staff());
		
		System.out.println(personageA.getName());
		personageA.getWeapon().action();
		System.out.println();
		System.out.println(personageB.getName());
		personageB.getWeapon().action();
		System.out.println();
		personageA.setWeapon(new Arc());
		
		System.out.println(personageA.getName());
		personageA.getWeapon().action();
		System.out.println();
		System.out.println(personageB.getName());
		personageB.getWeapon().action();
		
	}

}
