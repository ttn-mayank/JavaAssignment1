/**
 * 
 */
package Quest5;

/**
 * @author mayank
 *
 */
public interface Interface1 {

	void show();
	
	public default void display() {
		System.out.println("From Interface 1");
	}
}
