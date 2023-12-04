
public class MainClass {
	public static void main(String[] args) {
		Encapsulate encapsulate =new Encapsulate();
		encapsulate.setI(-89);
		encapsulate.setPrivateString("vowel");
		int e=encapsulate.getI();
		System.out.println(e);
		System.out.println(encapsulate.getPrivateString());
	}
}
