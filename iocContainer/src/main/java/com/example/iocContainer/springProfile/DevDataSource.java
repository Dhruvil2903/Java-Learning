package com.example.iocContainer.springProfile;

public class DevDataSource {

	 private String url = "jdbc:h2:mem:testdb";

	    public DevDataSource() {
	        System.out.println("DevDataSource initialized with URL: " + url);
	    }

	    public String getUrl() {
	        return url;
	    }
}
