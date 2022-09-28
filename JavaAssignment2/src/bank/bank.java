/**
 * 
 */
package bank;

/**
 * @author mayank
 *
 */
public interface bank {
	
	//get account 
	Account getAccount(long ac_no);
	
	//display bank details
	void getDetails();
	
	//create account
	boolean registerAccount(Account account);

}
