import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String args[]) {

		Map<Emp, String> m = new HashMap<Emp, String>();
		Emp e1 = new Emp(1, "ish");
		Emp e2 = new Emp(1, "ish");
		m.put(e1, "emp1");
		m.put(e2, "emp2");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		/*System.out.println(m.keySet().toArray()[0].toString());
		System.out.println(m.keySet().toArray()[1].toString());*/
		System.out.println(m.get(e1));
		System.out.println(m.get(e2));
		Set<Entry<Emp,String>> set = m.entrySet();
		System.out.println(set);
		System.out.println(m.size());
		System.out.println(1 << 30);
		
		Map<String, String> map = new HashMap<>();

		map.put("1", "1"); // put example
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", null); // null value
		map.put(null, "100"); // null key

		String value = map.get("3"); // get example
		System.out.println("Key = 3, Value = " + value);
		Set<Entry<String, String>> entrySet = map.entrySet();
		System.out.println(entrySet);

		
		
	}
}
