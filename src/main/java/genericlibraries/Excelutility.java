package genericlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this class contains reusable methods to perform operation on excel workbook
 * @author manursmamurs
 *
 */
public class Excelutility 
{private Workbook wb;
	/**
	 * this method is used to initialize the excel
	 * @param excelpath
	 */
	public void excelInitialtion(String excelpath)
	{
		FileInputStream fis=null;
		try {
			 fis=new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();																																											
		}
		try {
			 wb=WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * this method is used to fetch single data from excel
	 * @param Sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 */
	public String fetchDataFromExecl(String Sheetname, int rownum, int cellnum)
	{
		return wb.getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	}
	/**
	 * this is method is used to fetch multiple data from excel
	 * @param Sheetname
	 * @return
	 */
	public List<String> fetchDataFromExecl(String Sheetname)
	{
		List<String>dataList=new ArrayList<>();
		Sheet sheet=wb.getSheet(Sheetname);
		for (int i = 0; i <4; i++)
		{
			String data=sheet.getRow(i).getCell(1).getStringCellValue();
		}
		return dataList;
	}
	/**
	 * this method is used to close the workbook
	 */
	public void closeExcel()
	{
		try {
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
