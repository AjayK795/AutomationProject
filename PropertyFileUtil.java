package CommonUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtil {

	public String getDataFromPropertyFile(String keyname) throws IOException
	{
		//‪\src\test\resources\vtigerLoginCredential.properties.txt
		FileInputStream fis=new FileInputStream("src\\test\\resources\\logincredential.properties");
//		FileInputStream fis=new FileInputStream("src\\test\\resources\\data.properties");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(keyname);
		return value;
	}

}
