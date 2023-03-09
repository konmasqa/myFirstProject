package com.mvnproject.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	
	public ReadConfig()
	{
		File src = new File ("./Configuration/config.properties");
		
		try
		{	FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);			
		} catch (Exception e)
			{System.out.println("Exceptio is "+ e.getMessage());
			}
	}
	
	public String getBaseUrl()
	{
		String baseUrl = prop.getProperty("baseUrl");
		return baseUrl;
	}

	public String getUsername()
	{
		String username = prop.getProperty("username");
		return username;
	}
	
	public String getPassword()
	{
		String password = prop.getProperty("password");
		return password;
	}
	public String getchromepath()
	{
		String chromepath = prop.getProperty("chromepath");
		return chromepath;
	}
	public String getfirefoxpath()
	{
		String firefoxpath = prop.getProperty("firefoxpath");
		return firefoxpath;
	}
	public String getedgepath()
	{
		String edgepath = prop.getProperty("edgepath");
		return edgepath;
	}
	
}
