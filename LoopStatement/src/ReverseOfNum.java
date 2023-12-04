
public class ReverseOfNum {

	public static void main(String[] args) {
		int i=238,rem,rev=0;
		while(i > 0) {
			rem=i%10;
			rev =rev*10+rem;
			i=i/10;
		}
//		for(i=238;i>0;i/=10) {
//			
//			rem=i%10;
//			rev =rev*10+rem;
//		}
		System.out.println(rev);
		
		
		
		/*
		 * rem=i%10;//1 rev=rem;//rev=1 i=i/10;//23 rem=i%10;//3 rev =rev*10+rem;//13
		 * i=i/10;//2 rem=i%10;//2 rev =rev*10+rem;//130+2=132
		 */		System.out.print(rev);
	}

}
