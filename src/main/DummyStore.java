package main;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import models.Watch;

public class DummyStore implements Store {

	private ArrayList<String> brands = new ArrayList<String>();
	private Hashtable<String, Watch> watches = new Hashtable<String, Watch>();

	public DummyStore() {
		this.brands.add("Swatch");
		this.brands.add("Quartz");
		this.brands.add("LG");
		
		this.watches.put("Swatch", Watch.generateBrandedWatch("Swatch"));
		this.watches.put("Swatch", Watch.generateBrandedWatch("Swatch"));
		this.watches.put("Quartz", Watch.generateBrandedWatch("Quartz"));
		this.watches.put("LG", Watch.generateBrandedWatch("LG"));
	}

	public List<Watch> getWatches() {
		return new ArrayList<Watch>(watches.values());
	}
	
	public Set<Entry<String, Watch>> getWatchesByBrand() {
		return watches.entrySet();
	}
}
