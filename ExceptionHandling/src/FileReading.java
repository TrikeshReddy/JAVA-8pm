import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\User\\Desktop\\filebyjava.txt");
		Scanner fileReader = new Scanner(file);
		while(fileReader.hasNextLine())
		{
		String content = fileReader.nextLine();
		System.out.println(content);
		}
	}
}
