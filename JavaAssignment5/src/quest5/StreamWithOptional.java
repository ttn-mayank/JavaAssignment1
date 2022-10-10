/**
 * 
 */
package quest5;

import java.util.*;
import java.util.stream.IntStream;


/**
 * @author mayank
 *
 */
public class StreamWithOptional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		list.stream()
		.filter(i -> i>7)
		.findFirst()
		.ifPresentOrElse(System.out::println, ()->System.out.println("value doesn't exist"));
		
		
		list.stream()
		.filter(i -> i>7)
		.findFirst()
		.or(()-> Optional.of(-1))
		.ifPresentOrElse(System.out::println, ()->System.out.println("value doesn't exist"));
		
		list.stream()
		.filter(i -> i>7)
		.findFirst().stream()
		.mapMulti((number,consumer) -> IntStream.rangeClosed(1, 10)
		.forEach(e -> consumer.accept(e*number)))
		.forEach(System.out::println);

	}

}
