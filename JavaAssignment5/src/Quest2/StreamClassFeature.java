/**
 * 
 */
package Quest2;

import java.util.Arrays;
import java.util.List;

/**
 * @author mayank
 *
 */
public class StreamClassFeature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(1,6,3,4,5,6,7,8,9,10);
		System.out.println("----takeWhile----");
		arr.stream()
		.takeWhile(i -> i<5)
		.forEach(System.out::println);
		
		System.out.println("----takeWhile----");
		arr.stream()
		.dropWhile(i -> i<5)
		.forEach(System.out::println);
	}

}
