package test7;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Q2FruitsNameReadAndWriteReverseExcel {

	public static void main(String[] args) {
		// Q2 Fruits Name Read And Write Reverse Order Excel
		try {
			FileInputStream fileInputStream = new FileInputStream("E:\\JavaTests\\AutomationTests\\src\\test7\\Fruits.xlsx");
			Workbook workbook = WorkbookFactory.create(fileInputStream);
			Sheet sheet1 = workbook.getSheetAt(0);
			int rowCount = sheet1.getPhysicalNumberOfRows();
			Sheet sheet2 = workbook.getSheet("Sheet2");
			if (sheet2 == null)
			{
				sheet2 = workbook.createSheet("Sheet2");
			}
			for (int i = 0; i < rowCount; i++)
			{
				Row sourceRow = sheet1.getRow(i);
				Row destRow = sheet2.getRow(rowCount - 1 - i);
				if (destRow == null)
				{
					destRow = sheet2.createRow(rowCount - 1 - i);
				}
				Cell sourceCell = sourceRow.getCell(0);
				String cellValue = (sourceCell == null) ? "" : sourceCell.getStringCellValue();
				Cell destCell = destRow.createCell(0);
				destCell.setCellValue(cellValue);
			}
			FileOutputStream fileOutputStream = new FileOutputStream("E:\\JavaTests\\AutomationTests\\src\\test7\\Fruits.xlsx");
			workbook.write(fileOutputStream);
			fileInputStream.close();
			fileOutputStream.close();
			System.out.println("Excel file is Modified...!");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

