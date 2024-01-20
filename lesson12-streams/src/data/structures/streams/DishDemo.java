package data.structures.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import model.DataModel;

public class DishDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
//		getDishes1(menu, a->a.getCalories() > 800)
//		.forEach(System.out::println);
	
		// B1 : convert Stream
		//	List<T>.stream() -> stream<T>
		// B2 : Using streams's method(s)(API)--> m1()->stream<X>
			
		// B3 : Convert to another data structure for storing
		
		
		List<Dish> dishesWIthHighCalories = menu.stream()
				.filter(d->d.getCalories() > 300)
				.collect(Collectors.toList());
		dishesWIthHighCalories.forEach(System.out::println);
		
		System.out.println("===================");
		getNames(menu, Dish::getName).forEach(System.out::print);;
		
		System.out.println("\n========================");
		Set<String> namesOfDishes = menu.stream()
					.map(d->d.getName())
					.collect(Collectors.toSet());
		namesOfDishes.forEach(System.out::print);
		
		System.out.println("\n====================");
		menu.stream()
		.filter(d->FoodCategory.VEGGIE.equals(d.getCategory()))
		.map(Dish::getName)
		.forEach(name->System.out.print(name + " "));
	
		System.out.println("\n====================");
		
//		4 . Sort a budget map 
//		map -> set<entry<k , v >> -> list <entry<k,v>> -> sortByValue -> linkedhashMap
//  	Comparator.comparing(e ->e.getValue()) = Entry.comparingByValue()	
		
		Map<String, Integer>budget = sort(DataModel.getBudget());
		budget.forEach((k,v) ->System.out.println(k + "  " + v));
		
		System.out.println("===============================");
		Map<String, Integer> sortedMap = DataModel.getBudget().entrySet()
		.stream() // Stream<Entry<K,V>>
		.sorted(Entry.comparingByValue())
		.collect(Collectors.toMap(e->e.getKey(), e-> e.getValue(), (e1,e2) -> e1, LinkedHashMap::new));
		
		sortedMap.forEach((k,v) -> System.out.println(k + " " + v));

	}
	
	public static List<Dish> getDishes1(List<Dish>menu , Predicate<Dish>predicate)
	{
		List<Dish> result = new ArrayList<>();
		for ( Dish dish : menu)
		{
			if(predicate.test(dish)) result.add(dish);
		}
		return result ;
	}
	
	public static <R> Set<R> getNames	(List<Dish>menu , Function<Dish, R>function)
	{
		Set<R> result = new LinkedHashSet<>();
		for ( Dish dish : menu)
		{
			result.add(function.apply(dish));
		}
		return result ;
	}
	
	public static Map<String, Integer>sort(Map<String, Integer>budget)
	{
		Set<Entry<String, Integer>> budgetSet = budget.entrySet();
		List<Entry<String, Integer>> budgetList = new LinkedList<>(budgetSet);
		budgetList.sort(Comparator.comparing(Entry::getValue));
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Entry<String, Integer>entry : budgetList)
		{
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	} 
	
	
	
	
}
