package thuchanh;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exercise1_109 {

	public static void main(String[] args) throws IOException {
		
		//khai báo để read file
		FileInputStream file1 = new FileInputStream("D:\\Eclipse\\Funix_STP_304x\\testdata.xlsx");
		XSSFWorkbook wk1 = new XSSFWorkbook(file1);
		XSSFSheet s1 = wk1.getSheet("Sheet1");
		
		//khai báo để write file
		FileOutputStream file2 = new FileOutputStream("D:\\Eclipse\\Funix_STP_304x\\pastedata.xlsx");
		XSSFWorkbook wk2 = new XSSFWorkbook();
		XSSFSheet s2 = wk2.createSheet("Result");
		
		//khai báo số row của wk1
		int numberofrow1 = s1.getLastRowNum();
		for(int i=0;i<=numberofrow1;i++) {
			//tạo số row tương ứng cho wk2
			XSSFRow r1 = s1.getRow(i);
			XSSFRow r2 = s2.createRow(i);
			
			int numberofcell1 = r1.getLastCellNum();
			
			//khai báo số cell theo row
			for(int j=0;j<numberofcell1;j++) {
				
				XSSFCell c1 = r1.getCell(j);
				
				//read cell theo data type		
				if(c1.getCellType()==CellType.STRING) {
					System.out.print(c1.getStringCellValue()+" ");
				}
				else if (c1.getCellType()==CellType.NUMERIC) {
					System.out.print(c1.getNumericCellValue()+" ");
				}
				else if (c1.getCellType()==CellType.BOOLEAN) {
					System.out.print(c1.getBooleanCellValue()+" ");
				}
				//tạo cell cho wk2
				XSSFCell c2 = r2.createCell(j);
				
				//write cell theo data type cho wk2		
				if(c1.getCellType()==CellType.STRING) {
					c2.setCellValue(c1.getStringCellValue());
				}
				else if (c1.getCellType()==CellType.NUMERIC) {
					c2.setCellValue(c1.getNumericCellValue());
				}
				else if (c1.getCellType()==CellType.BOOLEAN) {
					c2.setCellValue(c1.getBooleanCellValue());
				}
				
			}
			
			System.out.println();
		}

		
		
	wk2.write(file2);	
	wk1.close();
	wk2.close();
	}

}
