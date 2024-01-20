package generic.type;

import java.util.function.Predicate;

public interface Ilist<E>{
	boolean add(E e);
	boolean addAll(Ilist<E>list);
	boolean remove(int removedIndex);
	boolean remove(E e);
	boolean removeIf(Predicate<E> predicate);
	
	E get(int i);
	void set(int i, E e);
	
	boolean isEmpty();
	int size();
//	boolean add(E e);
}
