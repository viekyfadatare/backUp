package ReadDataFromOuterFile;

import java.io.FileInputStream;  

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDemo {

	public static void main(String[] args) throws Exception {

		
		FileInputStream fis = new FileInputStream( "D:\\login.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet("Sheet1");

		int rowCount = sh.getPhysicalNumberOfRows();

		int colCount = sh.getRow(0).getLastCellNum();

		for (int i = 0; i < rowCount; i++) {

			for (int j = 0; j < colCount; j++) {

				Cell cl = sh.getRow(i).getCell(j);

				System.out.println(cl);

			}

		}

	}

	public static String readCell(String path , String Sheetname , int row ,int col) throws Exception {
		
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheetname);
        Cell cl = sh.getRow(row).getCell(col);
        
        return cl.toString();
	
		
	}

}
