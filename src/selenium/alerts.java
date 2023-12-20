package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alerts {

	public static void main(String[] args) {
		WebDriver madhu=new EdgeDriver();
		madhu.get("https://demo.automationtesting.in/Alerts.html");
		//madhu.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		//madhu.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		//madhu.switchTo().alert().accept();
		madhu.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		madhu.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		madhu.switchTo().alert().sendKeys("madhu hi how are you today");
		madhu.switchTo().alert().accept();
	}

}
