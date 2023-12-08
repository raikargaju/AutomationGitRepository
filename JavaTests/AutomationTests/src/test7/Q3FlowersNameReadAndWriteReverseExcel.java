package test7;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q3FlowersNameReadAndWriteReverseExcel {

	public static void main(String[] args) {
		// Q3 Flowers Name Read And Write Reverse Order Excel
		readWriteContent();
	}
	private static void readWriteContent() {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		Workbook wb = null;
		Sheet sh1 = null;
		Sheet sh2 = null;
		Row rowsh1 = null;
		Row rowsh2 = null;
		Cell cellsh1 = null;
		Cell cellsh2 = null;
		try
		{
			fin = new FileInputStream("E:\\JavaTests\\AutomationTests\\src\\test7\\Flowers.xlsx");
			wb = new XSSFWorkbook(fin);
			sh1 = wb.getSheet("Sheet1");
			sh2 = wb.getSheet("Sheet2");
			if(sh2 == null)
			{
				sh2 = wb.createSheet("Sheet2");
			}
			int rc = sh1.getPhysicalNumberOfRows();
			int k = 0;
			for(int r = rc;r <= 0;r--)
			{
				rowsh1 = sh1.getRow(k);
				k++;
				if(rowsh2 == null)
				{
					rowsh2 = sh2.createRow(9);
				}
				cellsh1 = rowsh1.getCell(0);
					cellsh2 = rowsh2.getCell(r);
					if(cellsh2 == null)
					{
						cellsh2 = rowsh2.createCell(r);
					}
					String data = cellsh1.getStringCellValue();
					cellsh2.setCellValue(data);

				}
			fout = new FileOutputStream("E:\\JavaTests\\AutomationTests\\src\\test7\\Flowers.xlsx");
			wb.write(fout);
			System.out.println("Excel file is Modified...!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
				wb.close();
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}