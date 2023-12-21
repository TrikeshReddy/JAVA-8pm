import java.util.LinkedList;
import java.util.List;

public class LinkkedList {
	public static void main(String[] args) {
		//int ==>Integer;
		List list =new LinkedList<String>();
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		list.add("fifth");
		list.add("sixth");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		list.add(1,"last");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
	
}
