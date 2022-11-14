package com.SauceDemo.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	private static XSSFWorkbook excelWorkBook;
	private static XSSFSheet excelSheet;

	public static String getCellData(int RowNo, int ColNum) throws IOException {
		FileInputStream ExcelFile = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/resources" + "/TestData.xlsx");
		excelWorkBook = new XSSFWorkbook(ExcelFile);
		excelSheet = excelWorkBook.getSheetAt(0);
		return excelSheet.getRow(RowNo).getCell(ColNum).getStringCellValue();
	}

	public static String getCheckoutData(int RowNo, int ColNum) throws IOException {
		FileInputStream ExcelFile = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/resources" + "/TestData.xlsx");
		excelWorkBook = new XSSFWorkbook(ExcelFile);
		excelSheet = excelWorkBook.getSheetAt(1);
		return excelSheet.getRow(RowNo).getCell(ColNum).getStringCellValue();
	}

	public static String getCellPostalCodeCheckout(int RowNocheckout, int ColNumcheckout) throws IOException {
		FileInputStream ExcelFile = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/resources" + "/TestData.xlsx");
		excelWorkBook = new XSSFWorkbook(ExcelFile);
		excelSheet = excelWorkBook.getSheetAt(1);
		return excelSheet.getRow(RowNocheckout).getCell(ColNumcheckout).getRawValue();

	}

}
