
public class VariableTypes {
	static int y=9;//static variable
	int z=90;//instance variable
	public static void myMethod() {
		//System.out.println(x);
		System.out.println("myMethod:"+y);
		VariableTypes refObj = new VariableTypes();
		System.out.println("myMethod instance variable"+refObj.z);
	}
	public static void main(String[] args) {
		int x=0;//local variable scope is with in the method
		int y=90;
		System.out.println("line number 12:"+y);
		System.out.println("global static :"+VariableTypes.y);
		System.out.println(x);
		System.out.println(y);
		VariableTypes.myMethod();
		VariableTypes variableTypes =new VariableTypes();
		//System.out.println(z);
		System.out.println(variableTypes.z);
		
	}
	
}
