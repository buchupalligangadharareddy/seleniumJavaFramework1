package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class propertiesFile {
	static Properties prop= new Properties();
	public static void main(String[] args) throws IOException {
		getProperties();
		setProperties();
		getProperties();
	}
	public static void getProperties(){
		
		try {
			
			InputStream input = new FileInputStream("D:\\eclipse\\SeleniumJavaFramework\\src\\test\\java\\config\\config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		
		}
	}
	public static void setProperties(){
		try {
			FileOutputStream output = new FileOutputStream("D:\\eclipse\\SeleniumJavaFramework\\src\\test\\java\\config\\config.properties");
			prop.setProperty("browser", "chrome");
			try {
				prop.store(output, null);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

}
