package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class frames {

	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame1= driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("mytext1")).sendKeys("selenium");
	}

}
