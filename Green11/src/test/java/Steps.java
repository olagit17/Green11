import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
	
	//Creating the JavascriptExecutor interface object by Type casting		
    JavascriptExecutor js = (JavascriptExecutor)driver;		
    
	
	@Given("^User is on the URL$")
	public void user_is_on_the_URL() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
    	
        String baseUrl = "https://www.greensill.com/";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
        
	}

	@Given("^User should view and verify home page loaded and correct homepage page title$")
	public void user_should_view_and_verify_home_page_loaded_and_correct_homepage_page_title() throws Throwable {
        String expectedTitle = "Homepage - Greensill";
        //String actualTitle = "";
        // get the actual value of the title
      //String  actualTitle = driver.getTitle();


        //if (actualTitle.contentEquals(expectedTitle)){
          //  System.out.println("Test Passed!");
       // } else {
        // get the actual value of the title
       // actualTitle = driver.getTitle();
    //System.out.println("Test Failed");
      //  }

	}

	@When("^User click the whatWeDo link$")
	public void user_click_the_whatWeDo_link() throws Throwable {
	   WebElement  whatWedLink  = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul[1]/li[2]/a"));		
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].click();", whatWedLink);
	}

	@Then("^they should be able to view and verify the Whatwedo page$")
	public void they_should_be_able_to_view_and_verify_the_Whatwedo_page() throws Throwable {
	   
	}
	//C19resourc 
	@When("^user click the C(\\d+)resources page$")
	public void user_click_the_C_resources_page(int arg1) throws Throwable {
		 
        WebElement  c19ResourcesLink  = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul[1]/li[1]/a"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", c19ResourcesLink);
       

	}

	@Then("^user should be able to view and verify the C(\\d+) page$")
	public void user_should_be_able_to_view_and_verify_the_C_page(int arg1) throws Throwable {
		 
	}

	@When("^user click the insight page$")
	public void user_click_the_insight_page() throws Throwable {
		WebElement insightLink   = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul[1]/li[3]/a"));
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click();",insightLink );
	}

	@Then("^user should be able to view and verify the insight page$")
	public void user_should_be_able_to_view_and_verify_the_insight_page() throws Throwable {
	   
	}

	@When("^user click the News page$")
	public void user_click_the_News_page() throws Throwable {
		WebElement newsLink   = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul[1]/li[4]/a"));
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click();",newsLink );
	}

	@Then("^user should be able to view the News page$")
	public void user_should_be_able_to_view_the_News_page() throws Throwable {
	    
	}

	@When("^user click the About page$")
	public void user_click_the_About_page() throws Throwable {
		WebElement aboutLink   = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul[1]/li[5]/a"));
	       JavascriptExecutor js = (JavascriptExecutor)driver;
	       js.executeScript("arguments[0].click();",aboutLink );
	}

	@Then("^user should be able to About the About page$")
	public void user_should_be_able_to_About_the_About_page() throws Throwable {
	    
	}



}
