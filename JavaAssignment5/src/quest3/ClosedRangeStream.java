/**
 * 
 */
package quest3;

import java.util.stream.IntStream;

/**
 * @author mayank
 *
 */
public class ClosedRangeStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream.range(1,50).forEach(System.out::println);
		
		IntStream.rangeClosed(1, 50).forEach(System.out::println);
	}

}
