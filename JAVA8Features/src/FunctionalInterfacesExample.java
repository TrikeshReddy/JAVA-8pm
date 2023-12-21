
public class FunctionalInterfacesExample implements FirstOne {

	@Override
	public void m1(String s) {
		System.out.println("welcome "+s);
	}
	public static void main(String[] args) {
		FunctionalInterfacesExample functionalInterfacesExample = new FunctionalInterfacesExample();
		functionalInterfacesExample.m1("first");
		
	}

}
