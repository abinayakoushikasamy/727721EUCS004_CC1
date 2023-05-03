package com.Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ques1 {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				ChromeOptions co=new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver(co);
				driver.get("https://www.saucedemo.com/");
				 WebElement uname= driver.findElement(By.id("user-name"));
	             uname.sendKeys("standard_user");
	             WebElement password=driver.findElement(By.id("password"));
	             password.sendKeys("secret_sauce");   
	             WebElement yesbutton=driver.findElement(By.id("login-button"));
	        	 yesbutton.click();
		         WebElement addcart=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		         addcart.click();		         
		         WebElement cart=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
				 cart.click();
				 WebElement checkout=driver.findElement(By.id("checkout"));
		         checkout.click();	
		         String cartCount = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).getText();
		         if (cartCount.equals("1")) {
		         	System.out.println("testcase1:ADDED TO CART SUCCESSFULLY");
		         }
		         driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
		         String product = "Sauce Labs Backpack";
		         if(driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")).getText().equals(product));
		         {
		         	System.out.println("testcase2:USER CAN VIEW THE CART");
		         }
		         driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		         if(driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText().equals("Checkout: Your Information")) {
		         	System.out.println("testcase3:FORM IS DISPLAYED");
		         }
		         WebElement fname= driver.findElement(By.id("first-name"));
	             fname.sendKeys("Anu");
	             WebElement lname= driver.findElement(By.id("last-name"));
	             lname.sendKeys("Varshini");
	             WebElement code= driver.findElement(By.id("postal-code"));
	             code.sendKeys("641008");
	            WebElement con=driver.findElement(By.id("continue"));
	            con.click(); 
	            System.out.println("Name of the product: " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")).getText());
	            System.out.println("Price of the product: " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div")).getText());            
		         
				
	        		

	}

}
