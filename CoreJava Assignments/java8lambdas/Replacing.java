package java8lambdas;
import java.util.ArrayList;
import java.util.function.UnaryOperator;

class Op implements UnaryOperator<String> {
	public String apply(String str) {
		return str.toUpperCase();
	}
}
public class Replacing {
	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("JavaScript");
		list.add("Kushal");
		list.add("MongoDb");
		list.add("Github");
		System.out.println("Words in list: "+list);
		System.out.println();
		list.replaceAll(new Op());
		System.out.println("Words in list after replace: "+list);
	}
}

