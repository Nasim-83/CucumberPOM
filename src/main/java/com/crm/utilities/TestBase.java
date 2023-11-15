package com.crm.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		
		try {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("/CucumberPOM/src/main/java/com/crm/configproperties/config.properties");
	
		prop.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	
	public static void initilization() {
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			driver=new ChromeDriver();
		}else {
			 driver=new EdgeDriver();
		}
		
		
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	
	

}
