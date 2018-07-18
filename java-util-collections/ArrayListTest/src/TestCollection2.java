import java.util.ArrayList;

public class TestCollection2 {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajaya");
		
		for (String obj : al)
			System.out.println(obj);
	}

}
