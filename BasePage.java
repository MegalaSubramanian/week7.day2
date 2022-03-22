package testHooks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class BasePage {
	
	public ChromeDriver driver;
	public String sheetName;
	public static Properties prop, prop1;
	public static FileInputStream fis, fis1;
	
	
	@BeforeMethod
	public void launch() throws IOException {	
		
		prop = new Properties();
		fis = new FileInputStream(new File("./src/test/java/testProperties/applicationProperties.properties"));
		prop.load(fis);		
		 String lang = prop.getProperty("language"); 
		 prop1 = new Properties(); 
		 fis1= new FileInputStream(new File("./src/test/java/testProperties/"+lang+".properties"));
		 prop1.load(fis1);
		 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(prop.getProperty("url"));	
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@DataProvider(name="Lead")
	public String[][] sendCreateData() throws IOException {
		return ReadExcel.fetchdata(sheetName);
	}
}