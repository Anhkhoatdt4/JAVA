package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex03LinkedList {
	private static int count = 50000;
	
	public static void main(String[] args) {
		List<String> alist = new ArrayList<>();
		List<String> llist = new LinkedList<>();
		
		long start = System.currentTimeMillis();
		for (int i = 0 ; i < count ; i++)
		{
			alist.add("element #" + i );
		}
		System.out.println("Add " + count + "elements: ArrayList took " + (System.currentTimeMillis() - start) + "ms");
		
		start = System.currentTimeMillis();;
		for (int i = 0 ; i < count ; i++)
		{
			llist.add("element #" + i );
		}
		System.out.println("Add " + count + "elements: LinkedList took " + (System.currentTimeMillis() - start) + "ms");
	}
}
