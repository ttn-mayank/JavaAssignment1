/**
 * 
 */
package question9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author mayank
 *
 */
public class UnmodifiableList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> list= new ArrayList();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        list.add(6);
	        list.add(7);
	        list.add(8);
	        list.add(9);
	                list.stream()
	                .filter(e->e%2==0).collect(Collectors.toUnmodifiableList()).add(10);

	}

}
