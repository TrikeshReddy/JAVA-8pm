import java.util.Arrays;

public class NestedLoops {

	public static void main(String[] args) {
		// nested loops means a loop statement inside another loop statement
		int[] ar = {1,2,3,2,5,6,7,8};
		//int j=0;
		int[] temp = {0,0,0,0,0,0,0,0};
		for(int i=ar.length-1;i>=0;i--) {
			temp[ar.length-1-i]=ar[i];
			//j++;
			}
		System.out.println(Arrays.toString(temp));
		int s=0,e=ar.length-1;
		while(s<e) {
			//s=0,e=7
			ar[s]=ar[s]+ar[e];//ar[s]=1+8=9
			ar[e]=ar[s]-ar[e];//ar[e]=9-8=1
			ar[s]=ar[s]-ar[e];//ar[s]=9-1=8
			s++;
			e--;
		}
		System.out.println(Arrays.toString(ar));

		}
	
	}
