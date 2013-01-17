/**
 * @author hyd 2013-1-17 下午3:58:27 
 * @version 1.0
 */
package com.renda.etc.poi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Ignore;
import org.junit.Test;

/**
 * xlsx
 * <p>
 * 
 */
public class PoiTest {

	@Ignore
	@Test
	public void create() throws IOException {
		Workbook wb = new HSSFWorkbook();
		wb.createSheet("h");
		FileOutputStream fileOut = new FileOutputStream("F:\\workbook.xls");
		wb.write(fileOut);
		fileOut.close();

		Workbook wb2 = new XSSFWorkbook();
		wb2.createSheet("y");
		FileOutputStream fileOut2 = new FileOutputStream("F:\\workbook.xlsx");
		wb2.write(fileOut2);
		fileOut2.close();
	}
	
	@Ignore
	@Test
	public void readWrite() throws InvalidFormatException, IOException {
		
		InputStream inp = new FileInputStream("F:\\workbook.xls");
	    //InputStream inp = new FileInputStream("workbook.xlsx");

	    Workbook wb = WorkbookFactory.create(inp);
	    Sheet sheet = wb.getSheetAt(0);
	    Row row = sheet.getRow(2);
	    System.out.println(row.getCell(2).getNumericCellValue());
	    Cell cell = row.getCell(3);
	    if (cell == null)
	        cell = row.createCell(3);
	    cell.setCellType(Cell.CELL_TYPE_STRING);
	    cell.setCellValue("a test a");

	    // Write the output to a file
	    FileOutputStream fileOut = new FileOutputStream("F:\\1-workbook.xls");
	    wb.write(fileOut);
	    fileOut.close();
	}
	
	@Ignore
	@Test
	public void text() throws IOException {
		InputStream inp = new FileInputStream("F:\\12.xls");
	    HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(inp));
	    ExcelExtractor extractor = new ExcelExtractor(wb);

	    extractor.setFormulasNotResults(true);
	    extractor.setIncludeSheetNames(false);
	    String text = extractor.getText();
	    System.out.println(text);
	}

}
