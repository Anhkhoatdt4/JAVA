package collections.list;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class dsa {
    public static void main(String[] args) {
        List<String> sequences = new ArrayList<>();
        sequences.add("a1");
        sequences.add("b2");
        sequences.add("c3");
        sequences.add("d4");
        System.out.println("size : " + sequences.size());
        loop(sequences);
        sequences.set(1, "b99");
        System.out.println("elements[1] " + sequences.get(1));
        sequences.remove(0);
        sequences.remove("d4");
        sequences.add("e2");
        sequences.add("f3");
        sequences.add("es4");
        loop(sequences);

        System.out.println("After remove : ");
        sequences.removeIf(c->c.compareTo("f") > 0);
        loop(sequences);
        System.out.println(sequences.contains("es4"));
        System.out.println();
        System.out.println(sequences.contains("d4"));
    }
    private static void loop(List<String> elements) {
        for (String element : elements)
            System.out.println(element + " ");
    }
    private static boolean removeIf(List<String> elements , Condition c) {
        Iterator<String> iterator = elements.iterator();
        while(iterator.hasNext())
        {
        	String each = iterator.next();
        	if(c.test(each) )
        		iterator.remove();
        }
        return true;
    }
    
}
interface Condition{
	boolean test(String element);
}
