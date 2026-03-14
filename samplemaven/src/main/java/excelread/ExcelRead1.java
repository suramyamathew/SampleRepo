package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {
	
	static FileInputStream f;//inbuilt class used to input an excel file
	static XSSFWorkbook w;//inbuilt class used to input a work book
	static XSSFSheet s;//inbuilt class used to input an excel sheet
	
	public static String getStringData(int a,int b) throws IOException 
	{
		f=new FileInputStream("C:\\Users\\admin\\Desktop\\Book1.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");//getSheet -used to get an excel sheet
		XSSFRow r=s.getRow(a);//XSSFRow - Inbuilt class used to input a row, getRow -inbuilt method used to get a row
		XSSFCell c=r.getCell(b);//XSSFCell -inbuilt class used to input a cell ,getCell -inbuilt method used to get a cell
		return c.getStringCellValue();//getStringCellValue -inbuilt method used to get a string value in the specified cell.
	}

	public static int getIntegerData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\admin\\Desktop\\Book1.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");//getSheet -used to get an excel sheet
		XSSFRow r=s.getRow(a);//XSSFRow - Inbuilt class used to input a row, getRow -inbuilt method used to get a row
		XSSFCell c=r.getCell(b);
		//typecasting -convertion of one data type to another
	
		
		int x=(int) c.getNumericCellValue();
		
		return x;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println(ExcelRead1.getStringData(1, 0));
		System.out.println(ExcelRead1.getIntegerData(1, 1));
		System.out.println(ExcelRead1.getStringData(2, 0));
		System.out.println(ExcelRead1.getIntegerData(2, 1));
		

	}


}
