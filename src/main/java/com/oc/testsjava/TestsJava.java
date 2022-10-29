package com.oc.testsjava;

public class TestsJava {

	public static void main(String[] args) {
		Bateau bateau = new Bateau();
		bateau.start();
	}

}

class Vehicule {
	void start() {
		System.out.println("-- vrouuuum -- °°");
	}
}

class Voiture extends Vehicule {

}

class Bateau extends Vehicule {

}
