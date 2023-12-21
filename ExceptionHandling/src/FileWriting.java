import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\User\\Desktop\\filebyjava.txt");
	System.out.println(file.canWrite());
	FileWriter fileWriter =new FileWriter(file);
	fileWriter.write("hello this is first time to write in a file with java");
	fileWriter.close();
	
}
}
