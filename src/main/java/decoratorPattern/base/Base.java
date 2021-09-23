package decoratorPattern.base;

import decoratorPattern.IBase;

public abstract class Base implements IBase {

	protected IBase baseDecorator;
	
	public Base(IBase baseDecorator) {
		this.baseDecorator = baseDecorator;
	}

	@Override
	public String getDescription() {
		return baseDecorator.getDescription();
	}
}
