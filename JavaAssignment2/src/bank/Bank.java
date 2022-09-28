/**
 * 
 */
package bank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank implements bank {

	private String bankName;
	private double rateOfInterest;
	private ArrayList<Account> accountList = new ArrayList<Account>();
	
	public Bank(String bankName,double rateOfInterest) {
		this.bankName=bankName;
		this.rateOfInterest=rateOfInterest;
		
		
		try {
		      File myObj = new File(bankName+"_transaction_log.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } 
		      
		    } catch (IOException e) {}
	}
	

	/**
	 * @return the accountList
	 */
	public ArrayList<Account> getAccountList() {
		return accountList;
	}

	@Override
	public boolean registerAccount(Account account) {
		// TODO Auto-generated method stub
		accountList.add(account);
		return true;
	}
	
	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("Bank : "+bankName);
		System.out.println("Interest Rate "+rateOfInterest);
	}

	/**
	 * @return the transaction_log
	 */
	public void getTransaction_log() {
		try(Scanner scanner = new Scanner(new File("test.txt"))) {
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	/**
	 * @param transaction_log the transaction_log to set
	 */
	public void setTransaction_log(String transaction) {
		
		try(PrintWriter writer = new PrintWriter(new File("test.txt"))) {
			writer.println(transaction);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	@Override
	public Account getAccount(long ac_no){
		
		// TODO Auto-generated method stub
		Account acc=null;
		for(Account x : accountList) {
			
			if(ac_no == x.getAccountNumber()) {
				acc= x;
			}
		}
		return acc;
	}


}
