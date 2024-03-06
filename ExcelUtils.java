package CommonUtils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

	public String getDataFromExcel(String sheetName,int row, int col) throws EncryptedDocumentException, IOException 
	{
//		FileInputStream fis = new FileInputStream("src\\test\\resources\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream("src\\test\\resources\\OrganizationData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row rw = sh.getRow(row);
		Cell c1 = rw.getCell(col);
		String data = c1.getStringCellValue();
		return data;

	}

}
