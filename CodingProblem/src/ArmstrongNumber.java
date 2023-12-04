
public class ArmstrongNumber {

	public static void main(String[] args) {
		int i=1634,rem,sum,armSTrongValue=0;
		int temp=i;
		int numOfDigits=(int) (Math.log10(i)+1);
		while(temp>0) {
			rem=temp%10;
			sum =(int) Math.pow(rem, numOfDigits);
			armSTrongValue+=sum;
			temp=temp/10;
		}
		if(i == armSTrongValue) {
			System.err.println("strong");
		}
		else {
			System.out.println("not a strong num");
		}
	
	}

}
