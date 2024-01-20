package desginpatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.DataModel;

public class AppleDemo {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		inventory.forEach(Apple -> System.out.println(Apple));
		System.out.println("============================");
	Predicate<Apple> pa = new Predicate<Apple>() {
		
		@Override
		public boolean test(Apple t) {
			return "green".equals(t.getColor());
			}
		};
//		filter(inventory, pa).forEach(Apple -> System.out.println(Apple));;
		filter(inventory, Apple-> "red".equals(Apple.getColor()))
		.forEach(Apple -> System.out.println(Apple));
		
		System.out.println("============================");
		filter(inventory, Apple-> Apple.getWeight() > 600)
		.forEach(Apple -> System.out.println(Apple));
		
		System.out.println("============================");
		
		filter(inventory, Apple-> "vietnam".equals(Apple.getOriginal()))
		.forEach(Apple -> System.out.println(Apple));
		
	}
	
	private static List<Apple>filter(List<Apple>inventory,Predicate<Apple> predicate)
	{
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory)
		{
			if (predicate.test(apple))
			{
				result.add(apple);
			}
		}
		return result;
	}
}
