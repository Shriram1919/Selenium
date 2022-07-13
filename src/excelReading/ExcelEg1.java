package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		

				
				File MyFile =new File("D:\\Tushar\\19thMarch.xlsx");
				String Word = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
			
				System.out.println(Word);
				
				
				
	}

}
