package models;

public class Order {
	private Watch watch;
	private Customer customer;
	
	public void addWatch(Watch watch) {
		this.watch = watch;
	}
	
	public void addCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public float getPrice(Currency currency) {
		float convertedPrice = watch.price;
		
		if (currency == Currency.USD) {
			return watch.price * 1.06282f;
		}
		else if (currency == Currency.GBP) {
			return watch.price * 0.851390052f;
		}
		
		return convertedPrice;
	}
	
	public String getReceipt(Currency currency) {
		return "Customer: " + customer.getName() + "\n" + "Watch brand: " + watch.brand
		+ "Watch name: " + watch.name + "\n" + "Price: " + getPrice(currency);
	}
}
