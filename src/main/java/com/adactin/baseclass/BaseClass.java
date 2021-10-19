package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getDriver(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + ("\\Driver\\chromedriver1.exe"));
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + ("\\Driver\\IEDriverServer.exe"));
				driver = new InternetExplorerDriver();
			} else {
				System.out.println("Invalid browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void currentUrl() {
		try {
			driver.getCurrentUrl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void forward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void backward() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void refresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void navigateTo(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void quite() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getTite() {
		try {
			driver.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enabled(WebElement element) {
		try {
			element.isEnabled();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void displayed(WebElement element) {
		try {
			element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void selected(WebElement element) {
		try {
			element.isSelected();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void screenshot(String pathName) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File Sourcefile = ts.getScreenshotAs(OutputType.FILE);
			File Desfile = new File(pathName);
			FileUtils.copyFile(Sourcefile, Desfile);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void dropDown(WebElement element, String Option, String value) {
		Select s = new Select(element);
		try {
			if (Option.equalsIgnoreCase("byIndex")) {
				int parseInt = Integer.parseInt(value);
				s.selectByIndex(parseInt);
			} else if (Option.equalsIgnoreCase("byValue")) {
				s.selectByValue(value);
			} else if (Option.equalsIgnoreCase("byVisibletext")) {
				s.selectByVisibleText(value);
			} else {
				System.out.println("Invalid option");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public static void SendKeys(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void simpleAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void confirmAlert(String ok, String cancel) {
		try {
			if (ok.equalsIgnoreCase("ok")) {
				driver.switchTo().alert().accept();
			} else if (cancel.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().dismiss();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void promptAlert(String ok, String value, String cancel) {
		try {
			if (ok.equalsIgnoreCase("ok")) {
				driver.switchTo().alert().sendKeys(value);
				driver.switchTo().alert().accept();
			} else if (cancel.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().sendKeys(value);
				driver.switchTo().alert().dismiss();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void actionMethod(WebElement element) {
		try {
			Actions a = new Actions(driver);
			a.contextClick(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void moveToElement(WebElement element) {
		try {
			Actions a = new Actions(driver);
			a.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void robot() {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public static void pageUp(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("argument[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void pageDown(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("argument[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void frameMethod(String option, String value, WebElement element) {
		try {
			if (option.equalsIgnoreCase("byIndex")) {
				int index = Integer.parseInt(value);
				driver.switchTo().frame(index);
			} else if (option.equalsIgnoreCase("byElement")) {
				driver.switchTo().frame(element);
			} else if (option.equalsIgnoreCase("byString")) {
				driver.switchTo().frame(value);
			} else {
				System.out.println("Invalid");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public static void clear(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void windowHandles() {
		Set<String> element = driver.getWindowHandles();
		for (String st : element) {
			String title = driver.switchTo().window(st).getTitle();
			System.out.println(title);

		}
	}

}
