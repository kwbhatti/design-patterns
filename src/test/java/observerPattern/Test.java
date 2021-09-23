package observerPattern;

import java.util.List;

import observerPattern.reporter.FlatReport;
import observerPattern.reporter.HtmlReport;
import observerPattern.reporter.IReport;
import observerPattern.result.Result;

public class Test {

	public static void main(String[] args) {
		
		Result result = new Result();
		new FlatReport(result);
		new HtmlReport(result);
		List<IReport> reports = result.getAssociatedReports();

		for (int i = 1; i <= 10; i++) {
			result.createResult("Test " + i);
			reports.forEach(r -> r.reportResult());
		}
	}
}
