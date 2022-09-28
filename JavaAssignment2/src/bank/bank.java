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
	
	public void addAmount(Account acc,double add_amount);
	
	public void deductAmount(Account acc,double deduct_amount);

}
