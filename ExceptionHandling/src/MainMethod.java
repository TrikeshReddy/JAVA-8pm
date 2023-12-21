
public class MainMethod {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		try {
			int b = 10 / 0;
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// if array index out i have given one solution
			System.out.println(arr[arr.length - 1]);
		}

		catch (ArithmeticException e) {
			System.out.println("we cannot divide any number by zero");
		}

		catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception");
			System.exit(0);
		} finally {
			System.out.println("i will be executed");
		}
	}
}
