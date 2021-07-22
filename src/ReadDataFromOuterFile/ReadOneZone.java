package ReadDataFromOuterFile;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadOneZone {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("./Exel/OneZone.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet("OneZone");

		int rowCount = sh.getPhysicalNumberOfRows();

		int colCount = sh.getRow(0).getLastCellNum();

		for (int i = 0; i < rowCount; i++) {

			for (int j = 0; j < colCount; j++) {

				Cell cl = sh.getRow(i).getCell(j);

				System.out.println(cl);

			}

		}

	
		
	}

}
