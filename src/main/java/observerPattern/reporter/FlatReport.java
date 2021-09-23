package observerPattern.reporter;

import observerPattern.result.Result;
import observerPattern.result.Result.ResultValue;

public class FlatReport implements IReport {

	private Result result = null;
	private String testname = null;
	private ResultValue resultValue = null;
	
	public FlatReport(Result result) {
		this.result = result;
		result.add(this);
	}

	@Override
	public void resultReady() {
		this.testname = this.result.getTestname();
		this.resultValue = this.result.getResultValue();
	}
	
	public void reportResult() {
		System.out.println("IN TEXT REPORT: \n\tTEST NAME: " + testname + "\n\tRESULT: " + resultValue);
	}
}
