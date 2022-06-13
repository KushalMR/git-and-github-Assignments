package basics;
import java.util.Scanner;
public class StudentMarks {

	public static void main(String[] args) {
		int subjects[]= new int[3];
		float total=0,avg;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the marks of 3 subjects");
		for(int i=0; i<3; i++)
		{
			subjects[i]=sc.nextInt();
			total=total+subjects[i];
			avg=subjects[i]/3;
			System.out.println("Average marks scored by each student is "+avg);
		}
		System.out.println("Total marks is "+total);
		avg=total/3;
		System.out.println("Average marks is "+avg);

	}

}
