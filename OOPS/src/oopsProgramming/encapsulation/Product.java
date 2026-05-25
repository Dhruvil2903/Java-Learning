package oopsProgramming.encapsulation;

public class Product {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
//			System.out.println("");
//			System.exit(0);
			throw new IllegalArgumentException("Negatives are not allowed");
		} else {
			this.price = price;
		}
	}

	@Override
	public String toString() {

		return "price : " + price;
	}
}
