package runnerFiles;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Config {
	
	private DriverFactory driverFactory;
	private AppiumDriver<MobileElement> driver;
	
	private static int nav;

	@Before
	public void before() {
		nav = 0;
	}
	
	@After
	public void after() {

	}
	
	public AppiumDriver<MobileElement> abreCalculadora(String DEVICE_NAME, String UDID, String PLATFORM_VERSION) {
		driverFactory = new DriverFactory(nav, DEVICE_NAME, UDID, PLATFORM_VERSION);
		return driverFactory.getDriver();
	}
}
