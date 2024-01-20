package generic.type;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@SuppressWarnings("rawtypes")
public class JavaListImpl<E> implements Ilist
{
	private E[] elementData;
	private static final int DEFAULT_CAPACITY = 4;
	
	@SuppressWarnings("unchecked")
	public JavaListImpl()
	{
		this(DEFAULT_CAPACITY);
	}
		
	
	@SuppressWarnings("unchecked")
	public JavaListImpl(int capacity)
	{
		int newCapacity = capacity > DEFAULT_CAPACITY ? capacity : DEFAULT_CAPACITY;
		elementData = (E[])Array.newInstance(Object.class, newCapacity);
	}
	
	private int size = 0;
	
	
	public boolean add(List<E> e) {
		elementData[size++] = e;
		return true;
	}
	
	@Override
	public boolean remove(int removedIndex) {
	
		return false;
	}


	@Override
	public E get(int i) {
		
		return null;
	}


	@Override
	public boolean isEmpty() {
		
		return false;
	}

	@Override
	public int size() {
		return size;
	}


	@Override
	public boolean add(Object e) {
		
		return false;
	}


	@Override
	public boolean addAll(Ilist list) {
		
		return false;
	}

	@Override
	public boolean remove(Object e) {
		// 
		return false;
	}


	@Override
	public void set(int i, Object e) {
		// 
		
	}

}
