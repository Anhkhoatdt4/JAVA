package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02ListAddRemoveRetain {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("a");
		list2.add("b");
		list2.add("C");
		list2.add("d");
		
		List<String> listAddAll = new ArrayList<>(list1);
		listAddAll.addAll(list2);
		printf(listAddAll);
		
		List<String> listRemoveAll = new ArrayList<>(list1);
		listRemoveAll.removeAll(list2);
		printf(listRemoveAll);
		
		List<String> listRetailAll = new ArrayList<>(list1);
		listRetailAll.retainAll(list2);
		printf(listRetailAll);
	}
	private static void printf(List<String> elements)
	{
		for(String element:elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
