package CommonUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtil1 {

	public String getDataFromPropertyFile(String keyname) throws IOException
	{
		FileInputStream FIS=new FileInputStream("src\\test\\resources\\HmWrkLoginCredential.properties");
		Properties p=new Properties();
		p.load(FIS);
		String value=p.getProperty(keyname);
		return value;
	}

}
