package cucumber;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public WebDriver driver;

	public Properties properties;

	public void initElements() {
		PageFactory.initElements(driver, this);
	}
	
	public Properties loadPropertyFile(String fileLocation) throws IOException {
		FileInputStream fis = new FileInputStream(fileLocation);
		properties = new Properties();
		properties.load(fis);
		return properties;
	}

	public WebDriver browserLaunch(Browser browser) {

		if (browser.equals(Browser.CHROME)) {

			ChromeOptions options = new ChromeOptions();
			options.addArguments("incognito");
			options.addArguments("disable-infobars");
			options.addArguments("disable-popup-blocking");
			options.addArguments("disable-notifications");
			driver = new ChromeDriver(options);

		} else if (browser.equals(Browser.EDGE)) {
			EdgeOptions options = new EdgeOptions();
			options.addArguments("inprivate");
			options.addArguments("disable-infobars");
			options.addArguments("disable-popup-blocking");
			options.addArguments("disable-notifications");
			driver = new EdgeDriver(options);
		} else if (browser.equals(Browser.FIREFOX)) {
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public void implicitlyWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	public void waitUntillAlertIsPresent(int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void waitUntillframeToBeAvailableAndSwitchToIt(int seconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	}

	public void url(String url) {
		driver.get(url);
	}

	public void close() {
		driver.close();
	}

	public void quit() {
		driver.quit();
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public void minimize() {
		driver.manage().window().minimize();
	}

	public void fulScreen() {
		driver.manage().window().fullscreen();
	}

	public void backward() {
		driver.navigate().back();
	}

	public void forward() {
		driver.navigate().forward();
	}

	public void refresh() {
		driver.navigate().refresh();
	}

	public void selectByVisibleText(WebElement findElement, String text) {
		Select s = new Select(findElement);
		s.selectByVisibleText(text);
	}

	public void selectByValue(WebElement findElement, String value) {
		Select s = new Select(findElement);
		s.selectByValue(value);
	}

	public void selectByIndex(WebElement findElement, int index) {
		Select s = new Select(findElement);
		s.selectByIndex(index);
	}

	public boolean isMultiple(WebElement findElement) {
		Select s = new Select(findElement);
		return s.isMultiple();
	}

	public List<WebElement> getOptions(WebElement findElement) {
		Select s = new Select(findElement);
		return s.getOptions();
	}

	public WebElement getFirstSelectedOption(WebElement findElement) {
		Select s = new Select(findElement);
		return s.getFirstSelectedOption();
	}

	public List<WebElement> getAllSelectedOptions(WebElement findElement) {
		Select s = new Select(findElement);
		return s.getAllSelectedOptions();
	}

	public void deselectAll(WebElement findElement) {
		Select s = new Select(findElement);
		s.deselectAll();
	}

	public void deselectByIndex(WebElement findElement, int index) {
		Select s = new Select(findElement);
		s.deselectByIndex(index);
	}

	public void deselectByValue(WebElement findElement, String value) {
		Select s = new Select(findElement);
		s.deselectByValue(value);
	}

	public void deselectByVisibleText(WebElement findElement, String text) {
		Select s = new Select(findElement);
		s.deselectByVisibleText(text);
	}

	public Alert switchToAlertOnly() {
		return driver.switchTo().alert();
	}

	public void alertAccept() {
		driver.switchTo().alert().accept();
	}

	public void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}

	public void promptAlertWithSendkeys(String keysToSent) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(keysToSent);
		alert.accept();
	}

	public void switchToByindex(int index) {
		driver.switchTo().frame(index);
	}

	public void switchToByName(String name) {
		driver.switchTo().frame(name);
	}

	public void switchToByWebElement(WebElement findElement) {
		driver.switchTo().frame(findElement);
	}

	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	public void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}

	public void takesScreenshot(String PngName) throws IOException {
		TakesScreenshot take = (TakesScreenshot) driver;
		File Source = take.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\crick\\Documents\\java\\project\\Screenshot\\" + PngName);
		FileUtils.copyFile(Source, destination);
	}

	public void click(WebElement element) {
		element.click();
	}

	public void clear(WebElement element) {
		element.clear();
	}

	public void sendkeys(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}

	public void scrollIntoView(WebElement findElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", findElement);
	}

	public void javaScriptClick(WebElement findElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", findElement);
	}

	public void javaScriptSendKeys(WebElement findElement, String keysToSendWISQ) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=" + keysToSendWISQ, findElement);
	}

	public void actionsClickOnWebElement(WebElement findElement) {
		Actions a = new Actions(driver);
		a.click(findElement).build().perform();
	}

	public void actionsRightClickOnWebElement(WebElement findElement) {
		Actions a = new Actions(driver);
		a.contextClick(findElement).build().perform();
	}

	public void actionsMoveToTargetedWebElement(WebElement findElement) {
		Actions a = new Actions(driver);
		a.moveToElement(findElement).build().perform();
	}

	public void actionsRightClick() {
		Actions a = new Actions(driver);
		a.contextClick().build().perform();
	}

	public void actionsClick() {
		Actions a = new Actions(driver);
		a.click().build().perform();
	}

	public void enterKey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public void downKey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public void upKey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}

	public void rightKey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
	}

	public void leftKey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_LEFT);
	}

	public void robotMouseMoveAndClick(int x, int y) throws AWTException {
		Robot r = new Robot();
		int a = InputEvent.BUTTON1_DOWN_MASK;
		r.mouseMove(x, y);
		r.mousePress(a);
		r.mouseRelease(a);

	}

	public void windowshandels(int n) {
		if (n == 1) {
			Set<String> windowHandles = driver.getWindowHandles();
			Object[] array = windowHandles.toArray();
			String string = array[n - 1].toString();
			driver.switchTo().window(string);

		} else {
			Set<String> windowHandles = driver.getWindowHandles();
			int size = windowHandles.size();
			Object[] array = windowHandles.toArray();
			String string = array[size - (n - 1)].toString();
			driver.switchTo().window(string);
		}
	}

}
