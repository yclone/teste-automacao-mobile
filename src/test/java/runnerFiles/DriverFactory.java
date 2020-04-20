package runnerFiles;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {

	static AppiumDriver<MobileElement> driver;

	public DriverFactory(int opt, String DEVICE_NAME, String UDID, String PLATFORM_VERSION) {
		setup(opt, DEVICE_NAME, UDID, PLATFORM_VERSION);
	}

	public static AppiumDriver<MobileElement> getDriver() {
		return driver;
	}

	public static void setDriver(AppiumDriver<MobileElement> driver) {
		DriverFactory.driver = driver;
	}

	private String WindowsApplicationDriverUrl = "http://127.0.0.1:4723/wd/hub";

	public void setup(int opt, String DEVICE_NAME, String UDID, String PLATFORM_VERSION) {
		switch (opt) {
		case 0:
			try {

				DesiredCapabilities caps = new DesiredCapabilities();

				caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
				caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
				caps.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
				caps.setCapability(MobileCapabilityType.UDID, UDID);
				caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

				caps.setCapability("appPackage", "com.android.calculator2");
				caps.setCapability("appActivity", "com.android.calculator2.Calculator");

				URL url = new URL(WindowsApplicationDriverUrl);
				driver = new AppiumDriver<MobileElement>(url, caps);

			} catch (MalformedURLException e) {
				System.err.println("Causa: " + e.getCause());
				System.err.println("resposta = " + e.getMessage());
				e.printStackTrace();
			}

			break;

		default:
			break;
		}
	}
}
