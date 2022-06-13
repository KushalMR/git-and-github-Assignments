package basics;
import java.util.Scanner;
public class Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st subject marks");
		int sub1marks = sc.nextInt();
		System.out.println("Enter the 2nd subject marks");
		int sub2marks = sc.nextInt();
		System.out.println("Enter the 3rd subject marks");
		int sub3marks =sc.nextInt();
		if((sub1marks >60)&&(sub2marks>60)&&(sub3marks>60)) {
			System.out.println("Student is passed");
		}else if ((sub1marks>60&&(sub2marks>60))||(sub1marks>60&&(sub3marks>60))||(sub2marks>60&&(sub3marks>60))) {
			System.out.println("Student is promoted");
		}else {
			System.out.println("Student is Failed");
		}
		sc.close();
	}
}

