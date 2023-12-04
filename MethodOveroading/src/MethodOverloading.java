
public class MethodOverloading {
	public static void main(String[] args) {
		//unlocking a phone
		//passcode
		//pattern
		//face unlock
		//fingerprint
		System.out.println(MethodOverloading.unLock(1000));
		MethodOverloading.unLock("9786531");
		MethodOverloading.unLock("qwertu",null);
		
		
	}
	public static boolean unLock(int i) {	
		System.out.println("int called");
		return i==1000;	
	}
	public static boolean unLock(String s) {	
		System.out.println("string called");
		return s=="978654231";	
	}
	public static boolean unLock(String s1 ,String s2) {
		System.out.println("2 strings called");
		return s1=="qwertu" && s2=="asdfghj";
	}
	
}
