package oopsProgramming.encapsulation;

public class ProductMain {

	public static void main(String[] args) {
		try {
			Product product = new Product();
			product.setPrice(-1);
			System.out.println(product);
		} catch (IllegalArgumentException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
}
