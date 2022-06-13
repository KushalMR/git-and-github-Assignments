package basics;
import java.util.Scanner;
public class CuiApplication {
	public static void main(String[] args) {
	String userName ="Kushal";
	String _name = "kushal.in";
	String _password ="basic@007";
	Scanner sc =new Scanner(System.in);
	for(int i=1;i<=3;i++) {
		System.out.println("Enter user name");
		String name = sc.next();
		System.out.println("Enter the password :");
		String  password =sc.next();
		if((_name.contentEquals(name))&&(_password.contentEquals(password))) {
			System.out.println("Welcome "+ userName);
			break;
		}else {
			if(i==3) {
				System.out.println("Contact Admin");
			}else {
				System.out.println("Invalid username or password!");
			}
		}

	}
}

}

