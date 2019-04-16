import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelReading {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		//File f=new File("C:\\Users\\Lenovo\\Desktop\\arun.xlsx");
		FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\arun (2).xlsx");
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet("Sheet2");
		
	/*	int total_rows =  sh.getLastRowNum();
		Row r =sh.getRow(1);
		int total_cols =r.getLastCellNum();
		
		
		for(int i=0;i<total_rows;i++){
			
			r=sh.getRow(i);
			
		 for(int j=0;j<total_cols;j++)	{
			 
			 Cell c =r.getCell(j);
			 System.out.println(c.getStringCellValue());
		 }*/
		 
		sh.createRow(20).createCell(2).setCellValue("WelcomeJava");
		 FileOutputStream fo=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\arun (2).xlsx");
		 
		 wb.write(fo);
		 wb.close();
		fi.close();
		fo.close();
			
			
			
			
			
		}
		
	

}
	