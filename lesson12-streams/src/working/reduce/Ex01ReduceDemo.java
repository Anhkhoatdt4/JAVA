package working.reduce;

import java.security.Identity;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public class Ex01ReduceDemo {
	public static void main(String[] args) {
		List<Integer> numberList = List.of(1,5,7,2, 4);
		
		Integer sum = numberList.stream()
		//.reduce(0 , (n1 , n2) -> n1 + n2);
		//.reduce(Integer.MIN_VALUE , (result , elements) -> (result < elements) ? elements : result);
		.reduce(0 , Integer::sum);
		System.out.println(sum);
		
		/*
		 T reduce ( T identity , BinaryOperator<T>accumulator)
		 {
		 	T result = 0 ;
		 	for ( T element : this stream)
		 		result = accumulator.apply(result, element)
		 		return result;
		 }
		 */
		
		// BinaryOperator <T> T apply(T t1 , T t2); 
		
	}
}
