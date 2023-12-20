package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class radiobottons {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement rd2= driver.findElement(By.id("vfb-7-2"));
		 rd2.click();
		
		
	}

}
