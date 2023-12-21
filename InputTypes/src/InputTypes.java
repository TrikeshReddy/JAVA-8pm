import java.util.Scanner;

public class InputTypes {
//why do we use this
	//when you need to take input from users
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		byte b;
		double d;
		float f;
		
		System.out.println("enter int value");
		a = scanner.nextInt();
		
		System.out.println("enter byte value");
		b = scanner.nextByte();
		
		System.out.print("enter double value ");
		d = scanner.nextDouble();
		//ch =scanner.nextLine();
		
		System.out.println("entered int value is "+a);
		System.out.println("entered byte value is "+b);
		System.out.println("entered byte value is "+d);
	}
}
