package rechargeApplication;

public class Airtel implements Sim{

	@Override
	public void calling() {
		System.out.println("This is a calling method from Airtel class");
		
	}

	@Override
	public void data() {
		System.out.println("This is a data method from Airtel class");
		
	}

}
