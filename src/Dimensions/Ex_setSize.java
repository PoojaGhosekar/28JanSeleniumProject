package Dimensions;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_setSize {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
				
		Dimension d=new Dimension(200, 300);
		driver.manage().window().setSize(d);
		System.out.println(d);
	}

}
