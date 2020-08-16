package com.automationpractice.pojos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestApachePOI {

	public static void main(String[] args) throws IOException {
  /*
   *XSSF - work with excel files 2007+ -> xlsx
   *HSSF - work with excel files pre 2007 -> xls
   */

		
		FileInputStream f = new FileInputStream("data.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(f);
		
		XSSFSheet sheet = wb.getSheet("data");
		
		XSSFRow headerRow = sheet.getRow(0);
		
		XSSFCell cell = headerRow.getCell(2);
		
		System.out.println(cell);
		
//		int noOfRows = sheet.getLastRowNum(); // is not accurate
		
		int noOfRows = sheet.getPhysicalNumberOfRows();
		
		
		int noOfColumns = headerRow.getLastCellNum();
		
		System.out.println(noOfRows);
//		System.out.println(physicalNumberOfRows);
		System.out.println(noOfColumns);
		
		
		for (int i = 0; i < noOfRows; i++) {
			
			
			for (int j = 0; j < noOfColumns; j++) {
				
				XSSFCell cell2 = sheet.getRow(i).getCell(j);
				
				System.out.print(cell2 + "\t\t\t");
				
			}
			System.out.println();
			
		}
		
		
		XSSFCell myCell = sheet.getRow(1).getCell(0);
		
		myCell.setCellValue("PASSED");
		
		FileOutputStream fo = new FileOutputStream("data.xlsx");
		
		wb.write(fo);
		
		fo.close();
		
		wb.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
