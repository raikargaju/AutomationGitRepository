package test7;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q1VegetableNameExcel {

	public static void main(String[] args) {
		// Q1 Flower Name Excel Method 2
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet();
		XSSFRow row = sh.createRow(3);
		for(int i = 0;i < 20;i++)
		{
			XSSFCell cell = row.createCell(i);
			cell.setCellValue("Vegitable"+i);
		}
		try (FileOutputStream fileOut = new FileOutputStream("E:\\JavaTests\\AutomationTests\\src\\test7\\Vegitable.xlsx"))
		{
			wb.write(fileOut);
			System.out.println("Excel file is created...!");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				wb.close();
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}