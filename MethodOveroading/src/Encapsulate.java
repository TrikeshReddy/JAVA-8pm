
public class Encapsulate {
	private int i;
	private String privateString;

	public void setI(int j) {
		// System.out.println("setter called");
			this.i = j;
		// System.out.println(i);
	}

	public int getI() {
		return i;
	}
//setter are used to set the value of a variable by passing it to setter method
	public void setPrivateString(String v) {
		this.privateString = v;
	}
	public String getPrivateString() {
		return privateString;
	}
	

}
