package observerPattern.result;

import observerPattern.reporter.IReport;

public interface IResult {

	public void add(IReport iReport);
	public void remove(IReport iReport);
	public void notifyReport();
	
}
