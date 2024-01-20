package working.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01SliceFilterMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,1,2,2,5,5,3,4);
		numbers.stream()
		.distinct()
		.forEach(number ->System.out.print(number + " "));
	
		System.out.println("\n==================");
		
		Map<Integer,List<Integer>> map =  numbers.stream()
				.collect(Collectors.groupingBy(number -> number));
	
		map.entrySet()
		.stream()
		.filter(e -> e.getValue().size() == 1)
		.forEach(e ->System.out.println(e.getKey()));
	}
	
}
