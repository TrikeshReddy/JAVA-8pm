
public class PrimeOrNot {
	public static void main(String[] args) {
		int x = 27;
		boolean b=false;
		for (int i = 2; i < x/2; i++) {
			if (x % i == 0) {
				b=true;
				break;
			}
		}
		if(b) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
	}
}
