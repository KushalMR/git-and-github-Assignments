package junit;
public class Test {
	public static void main(String args[]) {
		BankAccount bankAccount = new BankAccount();
		System.out.println("Current balance : " + bankAccount.balance());
		System.out.println("Withdrawing : 20000");
		bankAccount.withdraw(20000);
	}
}
