package test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;

public class TestCase1 extends BaseClass {
	@Test
	public void search() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='q'][@type='text']")).sendKeys("selenium");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[2]/div[1]/span")).click();
		String actualtitle= driver.getTitle();
		String expectedTitle="selenium - Google Search";
		Assert.assertEquals(actualtitle, expectedTitle);
		System.out.println("Searching passed");
	}
	
	@Test
	public void testcase1() {
		System.out.println("This is test case 1");
	}

}
