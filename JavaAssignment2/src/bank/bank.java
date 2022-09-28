/**
 * 
 */
package bank;

import java.math.BigInteger;

/**
 * @author mayank
 *
 */
public interface bank {
	
	//get account 
	Account getAccount(String ac_no);
	
	//display bank details
	void getDetails();
	
	//create account
	boolean registerAccount(Account account);

}
