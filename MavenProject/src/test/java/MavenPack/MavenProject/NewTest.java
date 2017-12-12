package MavenPack.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;


public class NewTest {
  
  @BeforeTest
  public void start(){
		System.setProperty("webdriver.gecko.driver", "D:\\SeshankLPBackUP2017\\Ofc Stuff\\Testing Stuff\\Selenium\\Selenium drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://store.demoqa.com//");
        driver.manage().window().fullscreen();
        System.out.println("this is to check integration");

      
  }
}
