package generic.type;

public class GenericTypeDemo {
	public static void main(String[] args) {
		Ilist<String> list = new JavaListImpl<>();
		list.add("itema");
		list.add("itemb");
		System.out.println("size--> " + list.size() );
	}
}
