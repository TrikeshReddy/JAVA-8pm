import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set set= new HashSet<String>();
		set.add("set1");
		set.add("set2");
		set.add("example");
		set.add("set1");
		// Obtaining an Iterator
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        set.remove("set2");  
     // Obtaining an Iterator
        System.out.println("-==================");
        Iterator<String> itr1 = set.iterator();
        while(itr1.hasNext()) {
        	System.out.println(itr1.next());
        }
	}
}
