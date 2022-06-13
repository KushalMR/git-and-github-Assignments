package basics;
public class ArraySearch {
	public static void main(String[] args) {
		int[] num = {5,12,14,6,78,19,1,23,26,35,37,7,86,47};
		int Find =19;
		boolean found = false;
		for(int n : num) {
			if (n==Find) {
				found = true;
				break;
			}
		}
		if(found)
			System.out.println(Find +" is found.");
		else
			System.out.println(Find +" is not found.");
	}	
}

