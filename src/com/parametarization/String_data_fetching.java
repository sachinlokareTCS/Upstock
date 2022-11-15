package com.parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class String_data_fetching {

	public static void main(String[] args) throws Throwable {
		// create object of fileinputstream class
		FileInputStream fls=new FileInputStream("C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\Sachin..xlsx");
//use create method to open excel sheet
		String value = WorkbookFactory.create(fls).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(value);
	}

}
