package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
		WebDriver d = new EdgeDriver();
		d.get("https://demo.guru99.com/insurance/v1/register.php");
		d.findElement(By.name("lastname")).sendKeys("madhukasula");
		//WebElement provisional = d.findElement(By.name("licencetype"));

		//provisional.click();
	}

}
