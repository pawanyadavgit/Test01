package Test1.TestProTestPackage;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class JUnit1Test  
{
	static WebDriver driver;
	
	@FindBy(xpath="sfsf")	
	WebElement ele1;
	
//	@BeforeClass
	public static void setUp()
	{
		System.out.println("Inside setup--> setting up chrome driver");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pawan.yadav\\Desktop\\Docs\\Soft\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); 
	}
	
//	@AfterClass
	public static void tearDown() throws InterruptedException
	{	System.out.println("Inside tear down");
		System.out.println("Closing browser");
		driver.quit();
	}
	
//	@Test
	void testNavigate(){
		driver.navigate().to("str");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
	}
	
//	@Test
	public void testLocators()
	{
		By a = By.xpath("sdsd");
		WebElement ele = driver.findElement(a);
		
		
	}
    
//	@Test
    public void test01() throws InterruptedException
    {
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
    }
	
//	@Test
    public void testWaits()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        WebElement  ele = driver.findElement(By.id("jkjhj"));
        WebDriverWait wait = new WebDriverWait(driver, 35);        
        wait.until(ExpectedConditions.visibilityOf(ele));
        
        Wait<WebDriver> wt = new FluentWait<WebDriver>(driver)
        		.withTimeout(20, TimeUnit.SECONDS)
        		.pollingEvery(1, TimeUnit.SECONDS)
        		.ignoring(NoSuchElementException.class);        
        wt.until(ExpectedConditions.elementToBeClickable(By.id("dfdf")));
    }
	
//	@Test
    public void selectDropdown() throws InterruptedException
    {
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        
        WebElement ele = driver.findElement(By.xpath("//select[@name='country']"));
        if(ele.isDisplayed() && ele.isEnabled())
        	System.out.println("Dropdown present");
        
        Select sel = new Select(ele);
//        sel.selectByVisibleText("INDIA");
        
        sel.selectByIndex(5);
        if(sel.isMultiple())
        	System.out.println("Multiple selection allowed");
        Thread.sleep(5000);        
    }
	
//    @Test
	public void testMultipleSelect() throws InterruptedException
	{    	
		driver.navigate().to("http://jsbin.com/osebed/2");
		driver.manage().window().maximize();
        Thread.sleep(1000);
        
        WebElement ele = driver.findElement(By.id("fruits"));
        if(ele.isDisplayed())
        	System.out.println("dropdown present");
        
        Select sel = new Select(ele);
        if(sel.isMultiple())
        	System.out.println("Multiple select allowed");
        
        sel.selectByIndex(0);
        sel.selectByValue("apple");
        sel.selectByVisibleText("Grape");
        Thread.sleep(5000);
        
        List<WebElement> selElements = sel.getAllSelectedOptions();
        for (WebElement webElement : selElements) {
			System.out.println(webElement.getText());
		}        
        System.out.println(sel.getFirstSelectedOption().getText());        
	}
	
//	@Test
	public void testTable() throws InterruptedException
	{
		driver.get("https://www.toolsqa.com/automation-practice-table/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        
        WebElement tbl = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody"));
        List<WebElement> rows = tbl.findElements(By.tagName("tr"));
        for(int i=0;i<rows.size();i++)
        {
        	System.out.println(rows.get(i).findElement(By.tagName("th")).getText()+" :");
        	List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
        	for(int j=0; j<cols.size();j++)
        	{
        		System.out.println(cols.get(j).getText());
        	}
        	WebElement link = cols.get(cols.size()-1).findElement(By.tagName("a"));
        	if(link.isDisplayed())
        		System.out.println("Link is present in last column");
        
        	System.out.println("\n");
        }
       driver.manage().deleteAllCookies(); 
	}
	
//	@Test 
	public void testActionClass() throws InterruptedException
	{
		driver.get("https://demoqa.com/menu");
        driver.manage().window().maximize();
        Thread.sleep(1000);   
        Actions ac = new Actions(driver);
        String menu1 = "Music";
        String menu2 = "Rock";
        String menu3 = "Classic";
        
//        WebElement ele1 = driver.findElement(By.xpath("//div[@id='ui-id-9']"));
//        WebElement ele2 = driver.findElement(By.xpath("//div[@id='ui-id-10']"));
        
        List<WebElement> ele = driver.findElements(By.xpath("//div[contains(@id,'ui-id')]"));
        for (WebElement webElement : ele) {
//        	System.out.println(webElement.getText());
			if(webElement.getText().equalsIgnoreCase(menu1) && webElement.isDisplayed())			
				ac.moveToElement(webElement).perform();			
		}
        
        Thread.sleep(2000);
        
        for (WebElement webElement : ele) {
			if(webElement.getText().equalsIgnoreCase(menu2) && webElement.isDisplayed())			
				ac.moveToElement(webElement).perform();			
		}
        
        Thread.sleep(2000);
        
        for (WebElement webElement : ele) {
			if(webElement.getText().equalsIgnoreCase(menu3) && webElement.isDisplayed())			
				ac.moveToElement(webElement).perform();			
		}         
	}
	
//	@Test
	public void fileUpload() throws InterruptedException
	{
		driver.get("http://demo.guru99.com/test/upload");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
        ele.sendKeys("C:\\Users\\pawan.yadav\\Desktop\\test.txt");
        Thread.sleep(2000);
	}
	
//	@Test
	public void testAlert() throws InterruptedException
	{
		driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        WebElement cust = driver.findElement(By.xpath("//input[@name='cusid']"));
        WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        
        if(cust.isDisplayed())
        	cust.sendKeys("12345");
        	
        if(submitBtn.isDisplayed())
        	submitBtn.click();
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());

          Alert alert= driver.switchTo().alert();
          System.out.println(alert.getText());
          Thread.sleep(1000);
          alert.accept();
          System.out.println(driver.switchTo().alert().getText());         
	}
	
//		@Test
		public void testDesiredCapabilities()
		{
//			Incomplete...........			
			DesiredCapabilities dc = DesiredCapabilities.chrome();
			dc.setCapability(CapabilityType.BROWSER_NAME,"chrome");
			
			System.out.println(dc.getCapability(CapabilityType.BROWSER_NAME));						
		}
		
//		@Test
		public void testToolTip() throws InterruptedException
		{
//			driver.get("http://demo.guru99.com/test/social-icon.html");
//			Thread.sleep(3000);
//			WebElement e = driver.findElement(By.xpath("//a[@title='Facebook']"));
//			if(e.isDisplayed())
//				System.out.println(e.getAttribute("title"));
			
			driver.get("http://demo.guru99.com/test/tooltip.html");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			WebElement e = driver.findElement(By.xpath("//a[@title='Facebook']"));
			if(e.isDisplayed())
				System.out.println(e.getAttribute("title"));			 
		}
		
		@Test
		public void test02() 
		{
			Assert.assertTrue(true);			
			
		}
		
		@Test
		public void test03() 
		{
			System.out.println("Inside second test");
			Assert.assertTrue(true);			
			
		}
		
		@Test
		public void test04() 
		{
			System.out.println("Inside third test--->");
			Assert.assertTrue(true);			
			
		}
	
}
