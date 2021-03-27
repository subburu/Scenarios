package com.apachepoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	
	public static void main(String[] args) throws IOException, InvalidFormatException {
		
	//	File excelFile = new File("src/ExcelXLS.xls
		File excelFile = new File("D:\\workspace-d\\Scenarios\\resources\\Excel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(new File("D:\\workspace-d\\Scenarios\\resources\\Excel.xlsx"));

		
		  //FileInputStream fis = new FileInputStream(excelFile);
		  
//		XSSFWorkbook workbook = new XSSFWorkbook(wb);
		  
		  XSSFSheet sheet = wb.getSheetAt(0);
		  
		  XSSFRow row = sheet.getRow(3);
		  
		  XSSFCell cell = row.getCell(2);
		 
		
		String cellValue = cell.getStringCellValue();
		
		System.out.println(cellValue);
		
	}


}
