package com.qa.extentReport;

import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReportManager {
	
	public static void getInstance()
	{
		Date date = new Date();		
		
		String originalDateFormat = date.toString();
		
		String FileName = originalDateFormat.replace(":","_").replace(" ","_")+".html";

		//String FileName = modifiedDateFormat+".html";
		
		String FilePath = "reports//"+FileName;
		ExtentReports report = new ExtentReports(FilePath, true, DisplayOrder.NEWEST_FIRST);
       
		
	}

}
