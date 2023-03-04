package com.task1;
public class StockUpdateApp {

	public static void main(String[] args) {
		Stock stock = new Stock(1000);
		User user1 = new User("Ashvini");
		User user2 = new User("Divya");
		User user3 = new User("Seema");

		stock.addSubscriber(user1);
		stock.addSubscriber(user2);
		stock.addSubscriber(user3);

		stock.startUpdating();
	}

}
