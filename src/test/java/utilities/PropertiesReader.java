package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	private FileInputStream configpropfile;
	private  Properties configprop;
	private static String br;
	private static String url;
	private static String pname;


	public void init() {
		configprop=new Properties();

		try {
			configpropfile = new FileInputStream("config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			configprop.load(configpropfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		br=configprop.getProperty("browser");
		url=configprop.getProperty("url");
		pname=configprop.getProperty("product");

	}
	public String getbrowser()
	{
		return br;
	}

	public String geturl() {
		return url;
	}

	public String getproductname() {
		return pname;
	}

}

