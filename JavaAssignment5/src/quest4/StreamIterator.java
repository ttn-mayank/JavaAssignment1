/**
 * 
 */
package quest4;

import java.util.stream.IntStream;

/**
 * @author mayank
 *
 */
public class StreamIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream.iterate(0, i->i<10, i->i+1).forEach(System.out::println);
	}

}
