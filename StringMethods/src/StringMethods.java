import java.util.Arrays;

public class StringMethods {
public static void main(String[] args) {
	String s=new String("asDFgh");
	//methods in Strings
	//charAt ==>to get the character at 
	//a particular index and indexing starts from 0
	System.out.println(s.charAt(3));
	//toLowerCase()==>it just converts to lower case
	System.out.println(s.toLowerCase());//asDFgh or asdfgh==>asdfgh
	System.out.println(s);//asDFgh or asdfgh==>asDFgh
	
	//toLowerCase()==>it just converts to upper case
	System.out.println(s.toUpperCase());//asDFgh or ASDFGH==>ASDFGH
	System.out.println(s);//asDFgh or asdfgh==>asDFgh
	//endsWith("endingstring")==>Tests if this string ends with the specified suffix.
	System.out.println(s.endsWith("ert"));//false
	//startsWith=>Tests if this string starts with the specified prefix.
	s.startsWith("asD");//true
	
	//subString 
	//method overloading
	//first one takes one int and gives the sbstring from given index to last
	System.out.println(s.substring(3));//Fgh
	//second one takes 2 ints and gives the substring from 1st int index to till last int index
	System.out.println(s.substring(2, 4));//DF
	System.out.println(s.contains("gh"));//false
	String v="hi";//""
	System.out.println(s.isEmpty());//returns me true if length is 0 else false
	System.out.println(s.concat(v));
	System.out.println(s);
	String hi ="  this@is a%split@sample   ";
	String[] sarr=hi.split("@");
	System.out.println(Arrays.toString(sarr));
	s.indexOf('s');// to get the first occurence of given character
	System.out.println(hi.indexOf('i',7));
	System.out.println(hi.lastIndexOf("@is"));
	char[] carr=hi.toCharArray();
	System.out.println(Arrays.toString(carr));
	
	
	System.out.println(v.replace('i', 'e'));
	s.trim();
	
	/*
	 * String s1="aHel",t="Hflasd"; System.out.println(s1.compareTo(t));
	 */
}
}
