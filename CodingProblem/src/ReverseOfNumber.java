
public class ReverseOfNumber {
	public static void main(String[] args) {
		int i=2345,rem,rev=0;
		while(i>0) {		
			rem=i%10;
			rev=rev*10+rem;
			i=i/10;
		}
		System.out.println(rev);
	}
}
