package com.example.iocContainer.springProfile;

public class ProdDataSource {

	 private String url = "jdbc:mysql://localhost:3306/user";

	    public ProdDataSource() {
	        System.out.println("ProdDataSource initialized with URL: " + url);
	    }

	    public String getUrl() {
	        return url;
	    }
}
