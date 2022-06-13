package annotation;
public class test {

	public static void main(String[] args) {
		mymes mylambda=s-> s.length();
		System.out.println(mylambda.getlength("kushal"+" "));

	}
	interface mymes{
		int getlength(String s);
	}
}
