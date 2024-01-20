package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class DbProvider {
	private static String path = "db-config.properties";
	
	public static Properties getDbProps()
	{
		Properties props = new Properties();
		try
		{
			File file = new File(path);
			System.out.println("is : " + file.exists());
			props.load(new FileInputStream(new File(path)));
			
		}
		catch(Exception e )
		{
			e.printStackTrace();
		}
		return props;
	}
}