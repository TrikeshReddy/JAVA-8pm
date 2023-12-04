
public class MethodTypes {
	public static void main(String[] args) {
		int p = 10, t = 8, r = 12;
		// MethodTypes methodTypes =new MethodTypes();
		int si = MethodTypes.method1(2, 'w', 7);
		boolean i = method2();
		method3(r, 21.456f, 'o');
		method4();
	}

//method with arguments and with return type
	public static int method1(int p, char q, int r) {
		int si = (p * q * r) / 100;
		return si;
	}

//method with out arguments and with return type
	public static boolean method2() {
		System.out.println("method2 called");
		return true;
	}

//method with arguments and without return type
	public static void method3(int y, float x, char z) {
		System.out.println("method 3");
	}

//method with out arguments and without return type
	public static void method4() {
		System.out.println("method 3");
	}
}
