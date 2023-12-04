import java.util.Arrays;

public class Recurrsion {
	//a method which calls it self is considered as recurrsion
public static void main(String[] args) {
	int[] ar = {1,2,3,2,5,6,7,8};
	int n=5;
	System.out.println(fact(n));
	rev(ar,0,ar.length-1);
	System.out.println(Arrays.toString(ar));
}

private static int fact(int n) {
	//end the call
	if(n==1) {
		return 1;
	}
	
	//operation perform
	
	//call the recursive with some changes in input
		
	return	n*fact(--n);
	
	}

public static Object rev(int[] ar,int s,int e) {
	
	//end the call
	if(s>e) {
		return 0;
	}
		
	//operation perform
	//s=0,e=7
	ar[s]=ar[s]+ar[e];//ar[s]=1+8=9
	ar[e]=ar[s]-ar[e];//ar[e]=9-8=1
	ar[s]=ar[s]-ar[e];//ar[s]=9-1=8	
		
	//call the recursive with some changes in input
	return rev(ar,s++,e--);
}
}
