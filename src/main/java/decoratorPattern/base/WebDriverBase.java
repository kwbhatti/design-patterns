package decoratorPattern.base;

import decoratorPattern.IBase;

public class WebDriverBase extends Base {

	int numberOfDrivers = 0;
	
	public WebDriverBase(IBase baseDecorator, int numberOfDrivers) {
		super(baseDecorator);
		this.numberOfDrivers = numberOfDrivers;
	}

	public String getDescription() {
		return baseDecorator.getDescription() + " and "+ numberOfDrivers + " webdriver";
	}
}
