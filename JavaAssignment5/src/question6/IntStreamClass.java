/**
 * 
 */
package question6;

import java.util.stream.IntStream;

/**
 * @author mayank
 *
 */
public class IntStreamClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream
        .rangeClosed(1,10)
        .filter(e->e>7)
        .boxed()
        .findFirst()
        .stream()
        .mapMulti((number,Consumer)-> IntStream
                .rangeClosed(1,10)
                .forEach(e-> Consumer.accept(e*number)))
        .forEach(System.out::println);
	}

}
