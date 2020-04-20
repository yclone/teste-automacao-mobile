package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import runnerFiles.Actions;
import runnerFiles.DriverFactory;

public class ExecTestes {

	Actions action;
	AppiumDriver<MobileElement> driver = DriverFactory.getDriver();
	private final By cpoBusba = By.id("inpHeaderSearch");
	
	private final By one = By.id("com.android.calculator2:id/digit_1");
	private final By two = By.id("com.android.calculator2:id/digit_2");
	private final By three = By.id("com.android.calculator2:id/digit_3");
	private final By four = By.id("com.android.calculator2:id/digit_4");
	private final By five = By.id("com.android.calculator2:id/digit_5");
	private final By six = By.id("com.android.calculator2:id/digit_6");
	private final By seven = By.id("com.android.calculator2:id/digit_7");
	private final By eight = By.id("com.android.calculator2:id/digit_8");
	private final By nine = By.id("com.android.calculator2:id/digit_9");

	private final By plus = By.id("com.android.calculator2:id/op_add");
	private final By equalTo = By.id("com.android.calculator2:id/eq");
	private final By results = By.id("com.android.calculator2:id/result");
//	private final By results = By.id("com.android.calculator2:id/CalculatorResults");

	public ExecTestes(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		action = new Actions(driver);
	}

	public void clicaNumero(int Value) {

		switch (Value) {
		case 1:
			action.click(one);
			break;
		case 2:
			action.click(two);
			break;
		case 3:
			action.click(three);
			break;
		case 4:
			action.click(four);
			break;
		case 5:
			action.click(five);
			break;
		case 6:
			action.click(six);
			break;
		case 7:
			action.click(seven);
			break;
		case 8:
			action.click(eight);
			break;
		case 9:
			action.click(nine);
			break;
		default:
			break;
		}
	}

	public void clicaOperacaSoma() {
		action.click(plus);
		
	}

	public void clicaIgual() {
		action.click(equalTo);
		
	}

	public void validaResp(String resp) {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String respGet = action.getText(results);
		Assert.assertEquals(respGet, resp);
		
	}

}
