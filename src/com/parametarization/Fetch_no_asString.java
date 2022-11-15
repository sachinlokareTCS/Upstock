package com.parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_no_asString {

	public static void main(String[] args) throws Throwable {
		//create object fileinput stream class
		
		FileInputStream fls=new FileInputStream("C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\July0092.xlsx");
//to open excel sheet use create method
		String value = WorkbookFactory.create(fls).getSheet("sheet1").getRow(0).getCell(2).getStringCellValue();
	System.out.println(value);
	}

}
