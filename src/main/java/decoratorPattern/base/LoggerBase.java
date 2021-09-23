package decoratorPattern.base;

import decoratorPattern.IBase;

public class LoggerBase extends Base {

	public LoggerBase(IBase baseDecorator) {
		super(baseDecorator);
	}

	public String getDescription() {
		return baseDecorator.getDescription() + " and logger";
	}

}
