/**
 * 
 */
package question8;

/**
 * @author mayank
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoCloseableClass1 myResource1= new AutoCloseableClass1();
		AutoCloseableClass2 myResource2= new AutoCloseableClass2();
	        try {
				try (myResource1;myResource2) {
				    myResource1.openResource();
				    myResource2.openResource();
				    myResource1.displayResource();
				    myResource2.displayResource();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
