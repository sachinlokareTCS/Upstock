package com.parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_boolean_value {

	public static void main(String[] args) throws Throwable {
		// create object of filestream class
		FileInputStream fls=new FileInputStream("C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\July0092.xlsx");
//to open excel sheet use create method
boolean value = WorkbookFactory.create(fls).getSheet("sheet1").getRow(1).getCell(0).getBooleanCellValue();
	System.out.println(value);
	}

}
