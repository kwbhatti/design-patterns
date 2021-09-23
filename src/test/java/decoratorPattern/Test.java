package decoratorPattern;

import decoratorPattern.base.LoggerBase;
import decoratorPattern.base.ReportBase;
import decoratorPattern.base.WebDriverBase;

public class Test {

	public static void main(String[] args) {
		
		IBase executionContext = new ExecutionContext();
		IBase loggerBase = new LoggerBase(executionContext);
		IBase reportBase = new ReportBase(loggerBase);
		IBase webDriverBase = new WebDriverBase(reportBase, 3);
		
		
		System.out.println(webDriverBase.getDescription());
		
	}
}
