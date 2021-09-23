package observerPattern.reporter;

import observerPattern.result.Result;
import observerPattern.result.Result.ResultValue;

public class HtmlReport implements IReport {

	private Result result = null;
	private String testname = null;
	private ResultValue resultValue = null;
	
	public HtmlReport(Result result) {
		this.result = result;
		result.add(this);
	}

	@Override
	public void resultReady() {
		this.testname = this.result.getTestname();
		this.resultValue = this.result.getResultValue();
	}
	
	public void reportResult() {
		System.out.println("IN HTML REPORT: \n\tTEST NAME: " + testname + "\n\tRESULT: " + resultValue);
	}
}
