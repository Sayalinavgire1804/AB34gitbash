package IRetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Logic implements IRetryAnalyzer {
int count=0;
int retrytimes=2;
	@Override
	public boolean retry(ITestResult result) {
		if(count<retrytimes)
		{
			count++;
			return true;

		}
		return false;
	}

}
