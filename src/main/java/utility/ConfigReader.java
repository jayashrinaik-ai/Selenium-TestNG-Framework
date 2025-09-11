package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	 private static Properties Config;
	 
	 
	 // Load properties file
	 
	 public static void initProperties() {
		 
		 if (Config == null ) {
			 Config = new Properties() ;
			 
			 try {
				 FileInputStream fis= new FileInputStream("C:\\Users\\vikas\\eclipse-workspace\\com.nxgn\\src\\main\\java\\config.properties");
				 
				 Config.load(fis);
			 }catch(IOException e) {
				 e.printStackTrace();
			 }
		 }
	 }


	 // get property by key 
	 
	 public static String getProperty(String key) {
		 
		 if (Config==null) {
			 initProperties();
		 }
		 
		 return Config.getProperty(key);
	 }
}
