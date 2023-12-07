package fileOperation;
import java.io.File;
public class FileOperationDemo1 {

	public static void main(String[] args) {
		// File Operation Demo1
		cretaeFile();
		renameFile();
		deleteFile();
		fileCollections();
	}
	private static void cretaeFile()
	{
		try {
			File f1 = new File("E:\\Demo\\Exapmle\\sample.txt");
			f1.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void renameFile()
	{
		try {
			File f1 = new File("E:\\Demo\\Exapmle\\sample.txt");
			File f2 = new File("E:\\Demo\\Exapmle\\samplenew.txt");
			boolean v1=f1.renameTo(f2);
			System.out.println("File is renamed : "+v1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteFile()
	{
		try {
			
			File f2 = new File("E:\\Demo\\Exapmle\\samplenew.txt");
			boolean v2=f2.delete();
			System.out.println("File is deleted : "+v2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void fileCollections()
	{
		File f1=new File("E:\\Example\\FileDeatils");
		File[] f2=f1.listFiles();
		for(int i=0; i<f2.length; i++)
		{
			System.out.println(f2[i].getPath());
			if(f2[i].isFile() == true)//display on files 
			{
				if(f2[i].getName().endsWith(".xlsx"));
			}
		}
	}
}