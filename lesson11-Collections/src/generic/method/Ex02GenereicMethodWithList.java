package generic.method;

import java.util.Arrays;
import java.util.List;

public class Ex02GenereicMethodWithList {
	public static void main(String[] args) {
		List<Double> dList = Arrays.asList(1d,2d,3d,4d);
		printList("dlist", dList);
	}
	private static <E extends Number> void printList(String prefix , List<E> objects)
	{
		System.out.print(prefix + "-->");
		for(Number object : objects)
		{
			System.out.print(object + " ");
		}
		System.out.println();
	}
}
