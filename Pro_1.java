package project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pro_1 {
	
	public static void main(String[] args) throws Exception
	{
		
	//	System.setProperty("webdriverss.chrome.driver","C:\\Users\\q\\eclipse-workspace\\project_1\\Driver\\chromedriver.exe");	
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		//Enables web socket connections from the specified origins only. '*' allows any origin
		options.addArguments("remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
