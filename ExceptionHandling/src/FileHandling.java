import java.io.File;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\User\\Desktop\\filebyjava.txt");
		try {
			System.out.println(file.createNewFile());
			System.out.println("created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
