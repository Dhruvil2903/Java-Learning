package com.example.iocContainer.beanScope;

public class MangoService {

	public MangoService() {
		System.out.println("MangoService instance created: " + this);
	}

	public void serve() {
		System.out.println("Serving mango with instance: " + this);
	}
}
