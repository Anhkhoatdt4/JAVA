package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/* Luu tru ,quản lí danh sách biển số xe từng tỉnh thành VN
 * Kí hiệu biển số , thành phố t/ứ
 *  92 quảng nam
 *  43 da nang 
 *  75 hue 
 *  74 quảng trị 
 *  73 quảng bình
 *  
 *  Hash map : k duy tri thu tu cac phan tu dua vao 
 *  LinkedHashMap : duy tri thu tu cac phan tu dua vao
 *  
 *  TreeMap : tự động sắp xếp theo key
 *  		: Key yêu cầu con của Comparable<K>
 *  
*/

public class Ex01BasicMapDemo {
	public static void main(String[] args) {
		
		Comparator<Integer> keyDescComparator = (k1,k2) ->k2 - k1; 
			
		
		Map<Integer, String> model = new TreeMap<>(keyDescComparator);
		model.put(92, "quang nam");
		model.put(43, "da nang");
		model.put(75, "hue");
		model.put(74, "quang tri");
		model.put(43, "dn");
//		model.putIfAbsent(43, "dn");
		
		System.out.println(model.size());
		System.out.println(model.get(43));
		printf(model);
	}
		private static void printf(Map<Integer, String> map){
			Set<Entry<Integer, String>> entries = map.entrySet();
			for (Entry<Integer, String> entry : entries) {
				System.out.println(entry.getKey() + "--> " + entry.getValue() );
			}
		}
	
		
}
