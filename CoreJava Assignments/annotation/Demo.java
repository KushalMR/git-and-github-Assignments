package annotation;
public class Demo {
	@interface Test
	{
		
	}
	@Test
	public void test-case{
		System.out.println("hi")
	}
	public static void main(String[] args) {
		test-case tc = new test-case();
		tc.test-case();

	}
}
