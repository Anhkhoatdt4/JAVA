package working.streams;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import bean.Warehouse;
import model.DataModel;

public class Ex03_FlatMap {
	public static void main(String[] args) {
		List<Warehouse> whs = DataModel.getWhs();
		
		// 1. getname of warehouse in the list "whs";
//		whs.stream() // Stream<Warehouse>
//			.map(Warehouse::getName) // Stream<String>
//			.forEach(System.out::println);
		
//		2. count numbers of stores of wh 11
		whs.stream()
		.filter(wh ->wh.getId() == 11)  // Stream<Warehouse>
		.findFirst()
		.ifPresent(wh -> System.out.println("Amount of stores -->" + wh.getStoreIds().size()));
		
// 		3. count numbers of stores of country 2
		List<Integer> storeOfCountrty2 = whs.stream()
		.filter(wh -> wh.getCountryId() == 2)
		.map(wh -> wh.getStoreIds())
		.flatMap(list -> list.stream())
		.collect(Collectors.toList());
		System.out.println("Amount --> " + storeOfCountrty2);
// 4. count number of stores of each country
		whs.stream()
		    .collect(Collectors.toMap(
		        Warehouse::getCountryId,
		        wh -> wh.getStoreIds().size(),
		        Integer::sum,
		        LinkedHashMap::new
		    ))
		    .forEach((countryId, storeCount) -> System.out.println("Country " + countryId + " has " + storeCount + " stores."));
				
				
		
	}
}
