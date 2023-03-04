package com.task1;
public class User implements Subscriber {

	private String name;

	User(String name) {
		this.name = name;
	}

	@Override
	public void update(String userName, int stockValue) {
		System.out.println("User: " + this.name + " - Updated stock value: " + stockValue);
	}

}
