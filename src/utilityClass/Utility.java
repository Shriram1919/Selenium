package utilityClass;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
	
	
	public static String readDatafromExcelShrrt(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File MyFile =new File("D:\\Tushar\\19thMarch.xlsx");
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
		String value = MySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
			
	

}
