package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Warehouse;
import data.structures.streams.Dish;
import data.structures.streams.FoodCategory;
import desginpatterns.Apple;


public class DataModel {

	
	private DataModel()
	{
		
	}
	
	public static Map<String, Integer> getBudget()
	{
		Map<String, Integer> budget = new HashMap<>();
		budget.put("task-a", 500);
		budget.put("task-b", 200);
		budget.put("task-c", 400);
		budget.put("task-d", 100);
		budget.put("task-e", 999);
		budget.put("task-g", 770);
		budget.put("task-k", 320);
		return budget;
	}
	
	
	public static List<Dish> getDishes(){
		return List.of(
			new Dish("1" , "D01" , 120 , FoodCategory.FISH),
			new Dish("2" , "D02" , 360 , FoodCategory.FISH),
			new Dish("3" , "D04" , 880 , FoodCategory.FISH),
			new Dish("4" , "D04" , 880 , FoodCategory.MEAT),
			new Dish("5" , "D05" , 970 , FoodCategory.MEAT),
			new Dish("6" , "D06" , 650 , FoodCategory.MEAT),
			new Dish("7" , "D06" , 30 , FoodCategory.VEGGIE),
			new Dish("8" , "D08" , 30 , FoodCategory.VEGGIE)
				
			);
	}
	
	
	public static List<Apple> getApples()
	{
		return Arrays.asList
		(
			new Apple("A1","green", 200 ,"vietnam"),
			new Apple("A2","red", 400 ,"lao"),
			new Apple("A3","blue", 600 ,"ThaiLand"),
			new Apple("A4","green", 200 ,"brunei"),
			new Apple("B1","red", 800 ,"vietnam"),
			new Apple("B2","yellow", 100 ,"vietnam"),
			new Apple("B3","green", 700 ,"vietnam"),
			new Apple("B4","yellow", 500 ,"lao")
		);
	}	
		public static List<Warehouse> getWhs(){
		    List<Warehouse> warehouses = new ArrayList<>();

		    warehouses.add(new Warehouse(11, "WH-11", 1, List.of(1, 2, 3, 4, 5)));
		    warehouses.add(new Warehouse(12, "WH-12", 1, List.of(6, 7, 8, 9, 10)));
		    warehouses.add(new Warehouse(21, "WH-21", 2, List.of(11, 12, 13, 14, 15)));
		    warehouses.add(new Warehouse(22, "WH-22", 2, List.of(16, 17, 18, 19, 20)));

		    return warehouses;
		}
				
	
}
