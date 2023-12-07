package test7;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.*;

public class Q5CityName2ndHalfExcel {

	public static void main(String[] args) {
		// Q4 City Name 2nd Half Excel
        try {
            FileInputStream fileInputStream = new FileInputStream("E:\\JavaTests\\AutomationTests\\src\\test7\\City.xlsx");
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            Sheet sheet1 = workbook.getSheetAt(0);
            int rowCount = sheet1.getPhysicalNumberOfRows();
            int startRow = rowCount / 2;
            Sheet sheet2 = workbook.getSheet("Sheet2");
            if (sheet2 == null)
            {
                sheet2 = workbook.createSheet("Sheet2");
            }
            for (int i = startRow; i < rowCount; i++)
            {
                Row sourceRow = sheet1.getRow(i);
                Row destRow = sheet2.getRow(i - startRow);
                if (destRow == null)
                {
                    destRow = sheet2.createRow(i - startRow);
                }
                Cell sourceCell = sourceRow.getCell(0);
                String cellValue = (sourceCell == null) ? "" : sourceCell.getStringCellValue();
                Cell destCell = destRow.createCell(0);
                destCell.setCellValue(cellValue);
            }
            FileOutputStream fileOutputStream = new FileOutputStream("E:\\JavaTests\\AutomationTests\\src\\test7\\City.xlsx");
            workbook.write(fileOutputStream);
            fileInputStream.close();
            fileOutputStream.close();
			System.out.println("Excel file is Modified...!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}