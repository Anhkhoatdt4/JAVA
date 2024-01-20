package generic.method;

public class Ex01GenericMethod {
	public static void main(String[] args) {
		Double[] dArray = {1d, 2d,3d,4d};
		String[] sArray = {"hello" , "haha" , "hooh"};
		Integer[] iArray = {2,4,2,2};
		printArray("dArray", dArray);
		printArray("sArray", sArray);
		printArray("iArray", iArray);
		printArrayGeneric("1dArray", dArray);
		printArrayGeneric("2sArray", sArray);
		printArrayGeneric("3iArray", iArray);
	}
	private static void printArray(String prefix , Object[] array)
	{
		System.out.print(prefix + "-->");
		for(Object item : array)
		{
			System.out.print(item + " ");
		}
		System.out.println();
	}
	
	private static <Element> void printArrayGeneric(String prefix ,Element[] elements)
	{
		System.out.print(prefix + "-->");
		for(Element element: elements)
		{
			System.out.print(element + " ");
		}
		System.out.println();
	}
}	
