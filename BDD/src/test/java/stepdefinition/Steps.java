package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
WebDriver driver;

@Given("^Launch the Application\\.$")
public void launch_the_Application() throws Throwable {
	

    System.setProperty("webdriver.chrome.driver","C:\\Users\\vigneshwar.k\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://phptravels.org/index.php?rp=/login");

}

@When("^Enter Username and password and click on login button\\.$")
public void enter_Username_and_password_and_click_on_login_button() throws Throwable {
    
	driver.findElement(By.id("inputEmail")).sendKeys("kvigneshwar2810@gmail.com");
    driver.findElement(By.id("inputPassword")).sendKeys("Qwerty123!");
    Thread.sleep(100000);
    driver.findElement(By.id("login")).click();
	
}

@Then("^Login Successful\\.$")
public void login_Successful() throws Throwable {
    
	System.out.println("Login Successful");
	
}


	
	

}
