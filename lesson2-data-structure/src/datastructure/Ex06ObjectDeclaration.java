package datastructure;

import bean.Item;

public class Ex06ObjectDeclaration {
	public static void main(String[] args) {
		int number = 10;
		Item itemA = new Item(32, "item 30",12);
//		System.out.println(itemA.id);
//		System.out.println(itemA.name);
//		System.out.println(itemA.price);
		System.out.println("item A : " + itemA.toString());
		Item itemB = new Item();
	}
}
