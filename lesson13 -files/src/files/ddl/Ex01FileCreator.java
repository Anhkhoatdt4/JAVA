package files.ddl;

import java.io.File;
import java.io.IOException;

public class Ex01FileCreator {
	
	private static String pathname = "content.txt";
	
	public static void main(String[] args) {
		File file = new File(pathname);
		if ( !file.exists())
		{
			try {
				boolean isSuccess = file.createNewFile();

				System.out.println(file.getName() + (isSuccess ? "successful" : "fail" ));
				System.out.println(2);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		else 
		{
			System.out.println(file.getName() + " is already existed");
		}
	}
}
