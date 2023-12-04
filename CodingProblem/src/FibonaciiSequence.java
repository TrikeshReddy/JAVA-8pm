
public class FibonaciiSequence {
	public static void main(String[] args) {
		int f = 0, s = 1, a = 0, i = 0;
		System.out.println(f);
		System.out.println(s);
		while (i < 8) {
			a = f + s;
			f = s;
			s = a;
			i++;
		}
		System.err.println(a);
	}
}
