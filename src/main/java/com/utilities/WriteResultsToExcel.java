package com.utilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteResultsToExcel {

	private static XSSFWorkbook workbook;

	public static String writeData(String value1,String value2)
	{
		String fileName = DateUtil.getTimeStamp() + ".xlsx";
		workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Automation BaseTest Results");
        sheet.setColumnWidth(0, 80*256);
        sheet.setColumnWidth(1, 50*256);
        Row headerRow = sheet.createRow(0);
        Cell headerCell1 = headerRow.createCell(0);
        Cell headerCell2 = headerRow.createCell(1);
        headerCell1.setCellValue("GenericName1");
        headerCell2.setCellValue("GenericName1");    
        
        sheet.createRow(1).createCell(0).setCellValue(value1);
        sheet.getRow(1).createCell(1).setCellValue(value2);
        
        try {
			FileOutputStream fout = new FileOutputStream(System.getProperty("user.dir")+"/test-output/"+fileName);
			workbook.write(fout);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return fileName;
	}
	
}
