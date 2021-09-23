package decoratorPattern.base;

import decoratorPattern.IBase;

public class ReportBase extends Base {

	public ReportBase(IBase baseDecorator) {
		super(baseDecorator);
	}

	public String getDescription() {
		return baseDecorator.getDescription() + " and a report";
	}
}
