package main;

import java.util.List;

import models.Currency;
import models.Customer;
import models.Order;
import models.Watch;

public class Test {

	public static void main(String[] args) {
		Store store = new DummyStore();
		List<Watch> watches = store.getWatches();
		for(Watch watch : watches) {
			System.out.println(watch.id + " - " + watch.name + ", " + watch.brand + " " + watch.model);
		}
		
		Customer customer = new Customer("Diogo", "Ali", "O email");
		Order order = store.newOrder(1, customer);
		System.out.println(order.getReceipt(Currency.EUR) + "€");

		System.out.println(order.getReceipt(Currency.GBP) + "£");

		System.out.println(order.getReceipt(Currency.USD) + "$");
	}
	
	
}
