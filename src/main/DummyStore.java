package main;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import models.Customer;
import models.Order;
import models.Watch;

public class DummyStore implements Store {

	private ArrayList<String> brands = new ArrayList<String>();
	private Hashtable<String, Watch> watches = new Hashtable<String, Watch>();
	private Hashtable<Integer, Watch> watchesById = new Hashtable<Integer, Watch>();
	private ArrayList<Order> orders = new ArrayList<Order>();
	
	public DummyStore() {
		this.brands.add("Swatch");
		this.brands.add("Quartz");
		this.brands.add("LG");
		
		Watch watch1 = Watch.generateBrandedWatch("Swatch");
		Watch watch2 = Watch.generateBrandedWatch("Swatch");
		Watch watch3 = Watch.generateBrandedWatch("Quartz");
		Watch watch4 = Watch.generateBrandedWatch("LG");
		this.watches.put("Swatch", watch1);
		this.watches.put("Swatch", watch2);
		this.watches.put("Quartz", watch3);
		this.watches.put("LG", watch4);
		this.watchesById.put(watch1.id, watch1);
		this.watchesById.put(watch2.id, watch2);
		this.watchesById.put(watch3.id, watch3);
		this.watchesById.put(watch4.id, watch4);
		
	}

	public List<Watch> getWatches() {
		return new ArrayList<Watch>(watches.values());
	}
	
	public Set<Entry<String, Watch>> getWatchesByBrand() {
		return watches.entrySet();
	}

	public List<Order> getOrders() {
		return this.orders;
	}
	
	public Order newOrder(int watchId, Customer customer) {
		Order order = new Order();
		order.addCustomer(customer);
		order.addWatch(this.watchesById.get(watchId));
		this.orders.add(order);
		return order;
	}
	
}
