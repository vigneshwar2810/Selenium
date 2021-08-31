package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

@Listeners(listeners.Listeners.class)
public class PHP_Travels {

    	@Test
    	public void f() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vigneshwar.k\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wb;
        wb=new ChromeDriver();
        
        //login
        wb.get("https://phptravels.org/index.php?rp=/login");
        wb.findElement(By.id("inputEmail")).sendKeys("kvigneshwar2810@gmail.com");
        wb.findElement(By.id("inputPassword")).sendKeys("Qwerty123!");
        Thread.sleep(60000);
        wb.findElement(By.id("login")).click();

 


        //Select the product
        wb.findElement(By.id("Secondary_Sidebar-Client_Shortcuts-Order_New_Services")).click();

 

        wb.findElement(By.id("pid13")).click();

 

        //Added to cart
        wb.findElement(By.xpath("//button[@type='submit']")).click(); //Add to cart

 

    }
}
 


















	

