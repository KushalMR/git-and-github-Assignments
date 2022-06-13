package exception;
class AccountBalance extends Exception{
	String message;
	public AccountBalance(String message) {
		this.message=message;
	}
	@Override
	public String toString() {
		return message;
	}
}
