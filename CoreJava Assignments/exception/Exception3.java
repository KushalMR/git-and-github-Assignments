package exception;

import java.util.Scanner;
public class Exception3 {

	static double balance=2000;
	
	public static void main(String[] args) throws AccountBalance {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to withdrawn");
		int n=sc.nextInt();
		try {
			if(balance<n) {
				throw new AccountBalance("InsufficientBalanceException " +balance);
			}
			if(n<0) {
				throw new AccountBalance("IllegalBankTransactionException");
			}
			else {
				System.out.println("Please collect your money!");
			}
		}
		catch(AccountBalance mab) {
			mab.printStackTrace();
		}
		sc.close();
	}

}
