package com.example.iocContainer.lifeCyclePreview;

public class MangoService {

	private String type;

	public MangoService() {
		System.out.println("Constructor invoked: mangoService instance is created");
	}

	public void setType(String type) {
		System.out.println("Setter injection: Setting type : " + type);
		this.type = type;
	}

	public void init() {
		System.out.println("Init method: bean is initialized with the type : " + type);
	}

	public void destroy() {
		System.out.println("destroy method: bean is about to be destroyed ");
	}

	public void serve() {
		System.out.println("Serving mango of type : " + type);
	}
}
