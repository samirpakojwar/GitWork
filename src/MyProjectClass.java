import org.openqa.selenium.chrome.ChromeDriver;

public class MyProjectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        // Selenium Code
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\ChromeDriver.exe");
		//Create Driver Object for chrome browser
		ChromeDriver driver=new ChromeDriver();
		//E:\Selenium\ChromeDriver.exe
		driver.manage().window().maximize();
		driver.get("https://www.google.com");		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		//System.out.println(driver.getPageSource());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.close();
		//driver.quit();
		
		
	}

}
