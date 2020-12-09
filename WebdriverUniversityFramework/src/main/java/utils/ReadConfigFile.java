package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigFile {
	
	protected InputStream input = null;
	protected Properties prop = null;
	
	public ReadConfigFile() {
		try {
			input = ReadConfigFile.class.getClassLoader().getResourceAsStream(Constant.CONFIG_PROPERTIES_DERICTORY);
			prop = new Properties();
			prop.load(input);
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public String getBrowser() {
		if(prop.getProperty("browser") == null) 
			return "";
		return prop.getProperty("browser");
	
}
}