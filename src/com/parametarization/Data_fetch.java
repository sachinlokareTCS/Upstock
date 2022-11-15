package com.parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_fetch {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//Question how to fetch data from excel
		//step1: first we have to create object fileinput stream class and give path of excel in constructor of fileinputstream
		
		FileInputStream fl=new FileInputStream("C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\DATA SHEET (1).xlsx");
	// step2: then use create method to open excel and use getrow and getcell method to fetch data
	double text = WorkbookFactory.create(fl).getSheet("Sheet1").getRow(2).getCell(4).getNumericCellValue();
	
	System.out.println(text);
	}

}
