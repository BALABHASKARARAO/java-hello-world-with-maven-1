import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestClass {
     public static  void main(String[] args){
    	  TestClass t=new TestClass();
    	  t.run();
     }
     public void run(){
    	 WebDriver driver=null;
    	 try{
             driver=new FirefoxDriver();
             String baseUrl="https://www.fileconvoy.com/index.php"; //upload file to this website
             driver.get(baseUrl);
             WebElement elem= driver.findElement(By.id("upfile_0"));
             elem.sendKeys("file:///Users/owner1/Desktop/Puppy.java"); //Path to the file to upload
             WebElement term=driver.findElement(By.id("readTermsOfUse")); //Click the term of use
             term.click();
             driver.findElement(By.id("upload_button")).click(); //click the submit button
    	 } catch(NoSuchElementException e){
    		 
    	 }finally{
    		 //firefoxDriver.quit();
    	 }
     }
}
