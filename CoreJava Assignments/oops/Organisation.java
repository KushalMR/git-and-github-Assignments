package oops;

public class Organisation {
	public static void main(String[] args) {
		Labour l=new Labour("Raju",15000,"Labour");
		Manager m=new Manager("Tom",25000,"Manager");
		l.calculateSalary();
		m.calculateSalary();
	}
}
