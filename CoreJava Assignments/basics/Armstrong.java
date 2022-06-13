package basics;
public class Armstrong {

	public static void main(String[] args) {
		int n = 153, originalNumber, rem, res=0;
		originalNumber = n;

		while(originalNumber!=0)
		{
			rem=originalNumber%10;
			res+= Math.pow(rem,3);
			originalNumber/= 10;
		}
		if(res == n)
			System.out.println(n + " is a Armstrong number.");
		else
			System.out.println(n + " is not a Armstrong number.");
	}
}

