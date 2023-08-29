package datastructure;

import bean.Item;

public class Ex07ObjectTypetest {
	public static void main(String[] args) {
		Item itemX =  new Item(01, "Item X",200);
		System.out.println(System.identityHashCode(itemX));
		modify(itemX);
		System.out.println(itemX.price);
	
	}
	private static void modify(Item item) {
		System.out.println(System.identityHashCode(item));
		item.price = 888;
		item = new Item(202,"Item Y", 555);
		System.out.println(System.identityHashCode(item));
		item.price = 999;
	}
}
