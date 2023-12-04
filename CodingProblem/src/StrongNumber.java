
public class StrongNumber {

	public static void main(String[] args) {
		int n=145,temp,rem,a,strongValue=0;
		temp=n;
		while(temp>0) {
			rem=temp%10;
			a=1;
			for(int i=1;i<=rem;i++) {
				a=a*i;
			}
			temp=temp/10;
			strongValue=strongValue+a;
		}
		if(n == strongValue) {
			System.err.println("strong");
		}
		else {
			System.out.println("not a strong num");
		}
	}

}
