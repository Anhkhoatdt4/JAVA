package collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import bean.Employee;

public class Ex02MapInside {
	public static void main(String[] args) {
		Employee e3 = new Employee(3, "E3" , 300d);
		Employee e4 = new Employee(4, "E4" , 400d);
		Employee e5 = new Employee(5, "E5" , 500d);
		Map<Employee, List<Employee>> map = getMap();
		System.out.println("size: " + map.size());
		map.put(e5, Arrays.asList(e4,e5));
		printf1(map);
	
	}
	
	private static Map<Employee, List<Employee>> getMap(){
		Employee e1 = new Employee(1, "E1" , 100d);
		Employee e2 = new Employee(2, "E2" , 200d);
		Employee e3 = new Employee(3, "E3" , 300d);
		Employee e4 = new Employee(4, "E4" , 400d);
		Employee e5 = new Employee(5, "E5" , 500d);
		
		Map<Employee, List<Employee>> result = new HashMap<Employee, List<Employee>>();
		result.put(e4, Arrays.asList(e2));
		result.put(e5, Arrays.asList(e1,e5));
		return result;
	}
	
	public static <K, V> void printf1(Map<K, V> map){
		Set<Entry<K, V>> entries = map.entrySet();
		for (Entry<K,V> entry : entries) {
			System.out.println(entry.getKey() + "--> " + entry.getValue() );
		}
	}
}
