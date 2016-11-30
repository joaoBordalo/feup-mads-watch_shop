package models;

public class Watch {

	private static int LAST_ID = 0;
	
	public int id;
	public String name;
	public String brand;
	public String model;
	public float price;

	public static Watch generateBrandedWatch(String brand) {
		Watch watch = new Watch();
		watch.id = LAST_ID++;
		watch.name = "A watch";
		watch.brand = brand;
		watch.model = "T10";
		watch.price = 1f;

		return watch;
	}
}
