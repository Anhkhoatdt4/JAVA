package collections.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		Set<String> text = new TreeSet<>(Comparator.reverseOrder());
		text.add("b");
		text.add("dsad");
		text.add("sdad");
		
		text.add(new String("b"));
		System.out.println(text.size());
		printf(text);
	}
	
	private static <E> void printf(Set<E>set)
	{
		for ( E e : set)
		{
			System.out.println(e);
		}
	}
}
