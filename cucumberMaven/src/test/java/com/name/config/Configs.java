package com.name.config;
import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class Configs {
	
	Properties pro;
	
	public Configs() throws Exception {
		File srcFile= new File("src/test/java/com/name/config/config.properties");		
		FileInputStream input= new FileInputStream(srcFile);
		pro =new Properties();
		pro.load(input);
	}
	
	public String getHost() {
		String hostURL=pro.getProperty("host");
		return hostURL;
	}
	
	public String getPath() {
		String pathURL=pro.getProperty("path");
		return pathURL;
	}
	
	
	public String getJsonAPIhost() {
		String hostURL=pro.getProperty("JsonAPIhost");
		return hostURL;
	}
	
	public String getJsonPostPath() {
		String pathURL=pro.getProperty("JsonPostPath");
		return pathURL;
	}

	
}

