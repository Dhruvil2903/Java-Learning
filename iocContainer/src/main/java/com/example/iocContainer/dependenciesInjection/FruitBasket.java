package com.example.iocContainer.dependenciesInjection;

public class FruitBasket {

	private Mango mango;

	public FruitBasket() {
		System.out.println("default constructor");
	}
	// Constuction injection
	public FruitBasket(Mango mango) {
		System.out.println("Constructor Injection: Basket got a " + mango.getVariety());
		this.mango = mango;
	}

	// Setter Injection
	public void setMango(Mango mango) {
		System.out.println("Setter Injection: Basket got a " + mango.getVariety());
		this.mango = mango;
	}

	public void showFruit() {
		System.out.println("Basket contains: " + mango.getVariety());
	}
}
