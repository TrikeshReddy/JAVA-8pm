
public class StringClass {
	public static void main(String[] args) {
		//create a string in two ways
		//first
		//only one string in string pool is  created and both points to the same 
			String stringName="hi";
			String s="hi";
		//second
			//creates two objects and one reference variable  

			String classObject = new String("Hi");
			String newOne=new String("Hi");
			
		//comparing two strings
			System.out.println(stringName.equals(classObject));//false
			System.out.println(stringName.equalsIgnoreCase(classObject));//true
			System.out.println(s == classObject);
			/*
			 * System.out.println(s.compareTo(stringName));
			 * s.compareToIgnoreCase(stringName);
			 */
		//they are immutable
			
			
	}
}
