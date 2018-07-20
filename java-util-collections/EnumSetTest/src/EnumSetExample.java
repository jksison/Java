import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetExample {

	enum days {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	} 

	
	public static void main(String[] args) {
		Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);  

		// Traversing elements  
	    Iterator<days> iter = set.iterator();  
	    while (iter.hasNext())  
	    	System.out.println(iter.next());  
	}

}
