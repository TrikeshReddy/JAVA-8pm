import java.util.ArrayList;
import java.util.List;

public class ArrayInt {
	public static  void main(String[] args) {
		//one way of declaring 
		int[] arr;
		
		arr = new int[12];
		arr[0]=10;
		arr[1]=20;
		System.out.println(arr[11]);
		//arr[12]=5; ArrayIndexOutOfBoundsException
		// 2nd way
		int[] intArr = {1,2,3,4,5,6};
		
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=78;
			System.out.println(arr[i]);
		}
		for(int i :arr) {
			
			System.out.println(i);
		}
		//for each 
		for(int i :intArr) {
			i=22;
			System.out.println(i);
		}
		for(int i=0;i<intArr.length;i++) {
			System.out.println(intArr[i]);
		}
		List list  = new ArrayList<Integer>(3);
		list.add("hello");
		list.add("world");//write method
		list.add("hello");
		list.add("world");
		list.add("world");
		list.add("world");
		list.add(4,"fourth");
		list.remove(1);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		
		//elementData = Arrays.copyOf(elementData, size, Object[].class);  	
	}

}
