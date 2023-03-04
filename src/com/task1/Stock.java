package com.task1;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stock {

	private int value;
	private List<Subscriber> subscribers = new ArrayList<>();
	private Random random = new Random();

	Stock(int value) {
		this.value = value;
	}

	public void addSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	public void removeSubscriber(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}

	private void notifySubscribers() {
		for (Subscriber subscriber : subscribers) {
			subscriber.update(subscriber.getClass().getSimpleName(), value);
		}
	}

	public void startUpdating() {
		while (true) {
			try {
				Thread.sleep((random.nextInt(6) + 5) * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			int change = random.nextInt(101) - 25 ; 
			value += change;
			System.out.println();
			System.out.println("Stock value updated - " + value);
			System.out.println();
			notifySubscribers();
		}
	}

}
