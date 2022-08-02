package com.listner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun_class implements IRetryAnalyzer{
	int Start=1;
	int end=3;
	
	@Override
	public boolean retry(ITestResult arg0) {
	
		if (Start<=end) {
			Start++;
			
			return true;//it will retry the class
			
		}

		return false;//it will stop the execution
	}
	

}
