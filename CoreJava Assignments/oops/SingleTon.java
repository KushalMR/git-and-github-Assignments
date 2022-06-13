package oops;
class SingleTon {
	static SingleTon st=new SingleTon();
	private SingleTon() {
		System.out.println("SingleTon Class");
	}
	static SingleTon getInstance() {
		return st;
	}
}
 