package main;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public interface Store {
	
	public List<Watch> getWatches();
	public Set<Entry<String, Watch>> getWatchesByBrand();
}
