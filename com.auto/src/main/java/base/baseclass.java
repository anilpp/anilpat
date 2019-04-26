package base;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	
	public static void main(String[] args){

		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabyasachi Mahapatra\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
    WebDriver driver=new ChromeDriver();
      
 driver.manage().window().maximize();
 driver.get("https://omnidesk.newgen.co.in/");
        
     //   driver.manage.window().deleteAllCookies();
       // driver.quit();
		
		
}}
