package string;
public class S3 {
	public static void main(String[] args) {
		String str =" Java String pool refers to collection of strings which are stored in heap memmory";
		System.out.println(str.toLowerCase ());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace("a","$"));
		System.out.println(str.contains("collection"));
		System.out.println(str.equals("java string pool refers to collection of strings which are stored in heap memmory"));
		System.out.println(str.equalsIgnoreCase("java string pool refers to collection of string which are stored in heap memmory"));	
	}
}