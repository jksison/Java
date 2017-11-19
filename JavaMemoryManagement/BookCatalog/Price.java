
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.sun.javafx.collections.UnmodifiableListSet;

public class Price {

	private Map<String,Double> rates; // mutable
	private Double value; // immutable
	
	public Price(Double value) {
		this.value = value;
		rates = new HashMap<String,Double>();
		rates.put("USD", 1d);
		rates.put("GBP", 0.6);
		rates.put("EUR", 0.8);
	}
		
	public Double convert(String toCurrency) {
		
		if (toCurrency.equals("USD")) {
			return value;
		}
		else {
			Double conversion = rates.get("USD") / rates.get(toCurrency);
			//value = conversion * value;
			// return value;
			return conversion * value;
		}
	}
	
	public String toString() {
		return this.value.toString();
	}
	
	// public Map<String,Double> getRates() {
	public Double getRates(String currency) {
		// return Collections.unmodifiableMap(rates);
		return rates.get(currency);
	}
	
}
