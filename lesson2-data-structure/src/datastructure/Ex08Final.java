package datastructure;

import bean.Item;

public class Ex08Final{
	public static void main(String[] args) {
		final int a = 20; 
		int b = 40;
		final Item itemZ= new Item(100,"Item Z",200);
		itemZ.name ="Updated Item";
		System.out.println(itemZ);
	}
}
