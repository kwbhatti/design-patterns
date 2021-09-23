package observerPattern.result;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import observerPattern.reporter.IReport;

public class Result implements IResult {

	public enum ResultValue {
		PASS,
		FAIL,
		SKIP
	}
	
	private List<IReport> reports = null;
	private ResultValue resultValue = null;
	private String testname = null;
	
	public Result() {
		this.reports = new ArrayList<IReport>();
	}
	
	public ResultValue getResultValue() {
		return this.resultValue;
	}
	
	public String getTestname() {
		return testname;
	}
	
	public List<IReport> getAssociatedReports() {
		return this.reports;
	}
	
	@Override
	public void add(IReport iReport) {
		reports.add(iReport);
	}

	@Override
	public void remove(IReport iReport) {
		reports.remove(iReport);
	}

	@Override
	public void notifyReport() {
		reports.forEach(r -> r.resultReady());
	}
	
	public void createResult(String testname) {
		this.testname = testname;
		int randomNumber = new Random().nextInt(3) + 1;
		if (randomNumber == 0) this.resultValue = ResultValue.PASS;
		else if (randomNumber == 1) this.resultValue = ResultValue.FAIL;
		else if (randomNumber == 2) this.resultValue = ResultValue.SKIP;
		System.out.println("In Result: \ttestname: " + testname + "\tresult: " + resultValue);
		notifyReport();
	}
}
