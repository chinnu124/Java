import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException  {
		File file = new File("c:\\");
		directoryCheck(file);

	}

	public static void directoryCheck(File file) throws IOException 
	{
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			if (files != null) {
				for (File f : files) {
					directoryCheck(f);
				}
			}
		}
		else 
		{
			try {
				System.out.println(file.getCanonicalPath());
			} catch (IOException e) {
				System.out.println("File not found");
				e.printStackTrace();
			}
		}
	}


}