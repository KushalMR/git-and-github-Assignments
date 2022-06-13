package string;
public class StringBuffer2 {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("It is used to _ at the specified index position.");
		System.out.println(str);
		str.delete(14, 15);
		System.out.println(str.insert(14,"insert text"));
	}
}
