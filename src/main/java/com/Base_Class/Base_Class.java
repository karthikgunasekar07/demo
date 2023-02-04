package com.Base_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Return;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver browser_Launch() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/karthikgunasekaran/eclipse-workspace/service/driver/chromedriver-2");
		 driver = new ChromeDriver();
		
		return driver;

	}

	public static void Url(String value) {
		driver.get(value);

	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public static void Wait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public static void inputValue(WebElement value, String Email) {
		value.sendKeys(Email);

	}

	public static void password(WebElement Value, String password) {
		Value.sendKeys(password);
	}

	public static void logIn(WebElement Login) {
		Login.click();
	}

	public static void ScreenShot(String screen) throws Throwable {
		TakesScreenshot shot = (TakesScreenshot) driver;
		File source = shot.getScreenshotAs(OutputType.FILE);
		File destination = new File(screen);
		FileUtils.copyFile(source, destination);

	}

	public static void navigateTo(String Value) {
		driver.navigate().to(Value);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	public static void alert(String value) {
		if (value.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (value.equalsIgnoreCase("dismiss")) {

		}

	}

	public static void action() {
		Actions act = new Actions(driver);

	}

	public static void robot() throws AWTException {
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void windowHandle(String value) {
		if (value.equalsIgnoreCase("windowhandle")) {
			driver.getWindowHandle();
		} else if (value.equalsIgnoreCase("windhandles")) {
			driver.getWindowHandles();
		}

	}

	public static void Dropdown(WebElement value, String Select) {
		Select opt = new Select(value);
		opt.selectByVisibleText(Select);

	}

	public static void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);

	}

	public static void isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}

	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}

	public static void getText(WebElement value) {
		String text = value.getText();
		System.out.println(text);

	}

	public void getCurrentUrl(WebElement element) {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void getAttribute(WebElement element, String Value) {
		String attribute = element.getAttribute(Value);
		System.out.println(attribute);

	}

	public static void Clear(WebElement action, String value) {
		action.clear();
		action.sendKeys(value);

	}

	public static void javaScriptExe(WebElement scroll_Down) {
		JavascriptExecutor rr = (JavascriptExecutor) driver;
		rr.executeScript("arguments[0].scrollIntoView();", scroll_Down);

	}

	public static void Close() {
		driver.close();

	}

	public static void quit() {
		driver.quit();

	}

	public static void Logout(WebElement value) {
		value.click();

	}

	/*
	 * public static void singleDropdown(WebElement Value2, String Select) {
	 * 
	 * Select abc = new Select(Value2); abc.selectByVisibleText(Select);
	 * List<WebElement> allSelectedOptions = abc.getAllSelectedOptions(); for
	 * (WebElement webElement : allSelectedOptions) {
	 * System.out.println(webElement.getText());
	 * 
	 * }
	 * 
	 * } public static void muldropdown(WebElement value3, String select1, String
	 * select2, String select3, String select4) throws Throwable { Select abc = new
	 * Select(value3); abc.selectByVisibleText(select1);
	 * abc.selectByVisibleText(select2); abc.selectByVisibleText(select3);
	 * abc.selectByVisibleText(select4); boolean multiple2 = abc.isMultiple();
	 * System.out.println(multiple2); List<WebElement> allSelectedOptions =
	 * abc.getAllSelectedOptions(); for (WebElement webElement : allSelectedOptions)
	 * { System.out.println(webElement.getText());
	 * 
	 * }
	 * 
	 * System.out.println("======================");
	 * 
	 * Thread.sleep(3000);
	 * 
	 * abc.deselectByVisibleText(select1); abc.deselectByVisibleText(select3);
	 * List<WebElement> allSelectedOptions3 = abc.getAllSelectedOptions(); for
	 * (WebElement webElement3 : allSelectedOptions3) {
	 * System.out.println(webElement3.getText());
	 * 
	 * }
	 * 
	 * Thread.sleep(3000);
	 * 
	 * abc.deselectAll(); System.out.println("=========================");
	 * List<WebElement> allSelectedOptions2 = abc.getAllSelectedOptions(); for
	 * (WebElement webElement2 : allSelectedOptions2) {
	 * System.out.println(webElement2.getText());
	 * 
	 * }
	 * 
	 * }
	 * 
	 * public static void URL1(String Alert) { driver.navigate().to(Alert); }
	 * 
	 * public static void alert(WebElement alert) { alert.click();
	 * driver.switchTo().alert().accept();
	 * 
	 * }
	 * 
	 * public static void Ok_Cancel(WebElement Alert1) { Alert1.click();
	 * 
	 * }
	 * 
	 * public static void confirm(WebElement Alert2) { Alert2.click();
	 * driver.switchTo().alert().dismiss(); }
	 * 
	 * public static void textbox(WebElement Textbox) { Textbox.click();
	 * 
	 * }
	 * 
	 * public static void promptbox(WebElement prompt) { prompt.click();
	 * 
	 * }
	 * 
	 * public static void Sendkey(String send) {
	 * driver.switchTo().alert().sendKeys(send); String text =
	 * driver.switchTo().alert().getText(); System.out.println(text + '\n');
	 * 
	 * }
	 */

}
