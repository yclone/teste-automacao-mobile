package runnerFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Actions {
	
	AppiumDriver<MobileElement> driver;
	
	public Actions(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public Actions click(By opt) {
		WebElement element = driver.findElement(opt);
		element.click();
		return new Actions(driver);
	}

	public String getText(By results) {
		  String textoColetado = DriverFactory.getDriver().findElement(results).getText();
		    System.out.println("Texto coletado : " + textoColetado);
		    return textoColetado;
	}

}
