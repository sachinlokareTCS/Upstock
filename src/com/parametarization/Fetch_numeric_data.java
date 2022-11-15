package com.parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_numeric_data {

	public static void main(String[] args) throws Throwable {
		// create object of inputstreamfile class
		FileInputStream fls=new FileInputStream("C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\July09.xlsx");
		// use create method to open excel sheet
		double value = WorkbookFactory.create(fls).getSheet("sheet1").getRow(0).getCell(2).getNumericCellValue();
System.out.println(value);
	}

}
