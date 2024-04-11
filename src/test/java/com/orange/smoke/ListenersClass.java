package com.orange.smoke;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListenersClass implements ITestListener{

	ExtentSparkReporter htmlreport=new ExtentSparkReporter("./target/extentreports/TestReport.html");
    ExtentReports report=new ExtentReports();
	ExtentTest test=null;
	
	public void onTestStart(ITestResult result) 
	{
	    // System.out.println("onTestStart:"+result.getName());
		report.attachReporter(htmlreport);
	}
	
	public void onTestSuccess(ITestResult result) 
	{
	    // System.out.println("onTestSuccess:"+result.getName());
		test=report.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Test Passed", ExtentColor.GREEN));
		
	}
	
	public void onTestFailure(ITestResult result) 
	{
		// System.out.println("onTestFailure:"+result.getName());
		test=report.createTest(result.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel("Test Failed", ExtentColor.RED));
	}
	
	public void onTestSkipped(ITestResult result) 
	{
		// System.out.println("onTestSkipped:"+result.getName());
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		// System.out.println("onTestFailedButWithinSuccessPercentage:"+result.getName());
	}
	
	public void onStart(ITestContext context) 
	{
		// System.out.println("onStart:"+context.getName());
	}

	public void onFinish(ITestContext context) 
	{
		// System.out.println("onStart:"+context.getName());
		report.flush();
	}
}
