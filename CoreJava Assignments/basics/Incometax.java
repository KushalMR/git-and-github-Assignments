package basics;
import java.util.Scanner;
public class Incometax {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Income");
		double income =sc.nextDouble();
		if ((income >= 0 && income <=180000)) {//slab A
			System.out.println("No need tn pay tax ");
		}
		else if(income >= 181001 && income <= 300000) {
			double tax =income*0.1;
			System.out.println("the tax amount payable is :"+ tax);
		}else if(income >= 300001 && income <= 500000) {
			double tax = income*0.2;
			System.out.println("the tax amount payable is :"+ tax);
		}else if(income >=500001 && income <= 1000000) {
			double tax = income*0.3;
			System.out.println("the tax amount payable is :"+ tax);
		}
		sc.close();
	}

}

