import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSte {
	public static void main(String[] args) {
		Set al = new LinkedHashSet<String>();
		 al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }
	}
}
