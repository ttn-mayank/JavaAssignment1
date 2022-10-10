/**
 * 
 */
package question8;

/**
 * @author mayank
 *
 */
public class AutoCloseableClass2  implements AutoCloseable{

	   void openResource(){
	        System.out.println("MyResource2 Opened");
	    }
	    void displayResource(){
	        System.out.println("MyResource2 running");
	    }
	    @Override
	    public void close() throws Exception {
	        System.out.println("MyResource2 closed");
	    }

}
