import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	//map maintains a key value pair
	//keys are unique 
	//values can be repeatating
public static void main(String[] args) {
	Map hashMap=new HashMap<Integer, String>();
	hashMap.put(1, "one");
	hashMap.put(2, "two");
	//put can overide the value if key already present
	//putIfAbsent will not override the value if already present
	hashMap.putIfAbsent(1, "one1");
	System.out.println(hashMap.get(1));
	Map hashMap1=new HashMap<Integer, String>();
	hashMap1.put(3, "one");
	hashMap1.put(4, "two");
	hashMap1.putAll(hashMap);
	System.out.println(hashMap1.get(1));
	Set al = new LinkedHashSet<Integer>();
	al=hashMap1.keySet();
	Iterator<Integer> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }
}
}
