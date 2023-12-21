
public class LambdaImpl {
	public static void main(String[] args) {
		SeondOne seondOne = () ->{
			System.out.println("hello this is m1 implementation");
		};
		seondOne.lambdaMethod();
		ThirdOne thirdOne =(string) ->{
			System.out.println("hello"+string);
		};
		thirdOne.m1("java");
		FourthOne fourthOne =(a,b) -> (a+b);
		
		System.out.println(fourthOne.add(10, 20));
	}
}
