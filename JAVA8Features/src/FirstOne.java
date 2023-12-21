@FunctionalInterface
public interface FirstOne {
	void m1(String s);//this is what it makes functional interface
	static void m2() {
		System.out.println("m2 method");
	}
}
