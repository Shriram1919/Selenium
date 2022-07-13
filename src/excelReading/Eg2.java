package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File NewFile =new File("D:\\Tushar\\HGS_T_SL.xlsx");
		
		Workbook File = WorkbookFactory.create(NewFile);
		Sheet Sheet = File.getSheet("Sheet2");
		Row MyRow = Sheet.getRow(3);
		Cell MyCell = MyRow.getCell(2);
		CellType CellInfo = MyCell.getCellType();
		
		
		
		System.out.println(CellInfo);
		
	}

}
