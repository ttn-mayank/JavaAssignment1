/**
 * 
 */
package question8;

/**
 * @author mayank
 *
 */
public class AutoCloseableClass1  implements AutoCloseable {

	/**
	 * @param args
	 */
	void openResource(){
        System.out.println("MyResource1 Opened");
    }
    void displayResource(){
        System.out.println("MyResource1 running");
    }
    @Override
    public void close() throws Exception {
        System.out.println("MyResource1 closed");
    }

}
