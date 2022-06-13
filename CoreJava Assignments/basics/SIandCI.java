package basics;
import java.util.Scanner;
public class SIandCI {
	public static void main(String[] args) {
		double pr,rate,t,sim,com;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		pr=sc.nextDouble();
		System.out.println("Enter the No. of Years");
		t=sc.nextDouble();
		System.out.println("Enter the rate of Intrest");
		rate=sc.nextDouble();
		sim=(pr*t*rate)/100;
		com=pr*Math.pow(1.0+rate/100.0, t) - pr ;
		System.out.println("Simple Intrest="+sim);
		System.out.println("Compund Intrest="+com);
	}

}
