package utils;

import java.util.List;

public class PrintUtils {
	private PrintUtils() {
	}
	public static <T> void print(String prefix , List<T>list) {
		System.out.println(prefix);
		System.out.println("==__>>------------------<<__==");
		
		list.forEach(System.out::println);
		
		System.out.println("==__>>------------------<<__==");
		
	}
	
	public static <T> void print2(String prefix , T item) {
		
		System.out.println(prefix);
		System.out.println("==__>>------------------<<__==");
		
		System.out.println(item);
		
		System.out.println("==__>>------------------<<__==");
		
	}
	
	
	public static <T> void excuteAndPrint(String prefix ,Runnable runnable) {
		
		System.out.println(prefix);
		System.out.println("==__>>------------------<<__==");
		
		runnable.run();
		
		System.out.println("==__>>------------------<<__==");
		
	}
	
}