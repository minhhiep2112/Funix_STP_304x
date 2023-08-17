package thuchanh;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice1 {

	public static void main(String[] args) throws IOException    {
		
		
			FileInputStream fs = new FileInputStream("D:\\Eclipse\\Funix_STP_304x\\testdata.xlsx");
			XSSFWorkbook wk = new XSSFWorkbook(fs);
			XSSFSheet s1 = wk.getSheet("Sheet1");
			XSSFRow r1 = s1.getRow(0);
			XSSFCell c1 = r1.getCell(0);
			
			//System.out.println(c1);
			//System.out.println(s1.getPhysicalNumberOfRows()); //Number of rows
			//System.out.println(s1.getLastRowNum());// Last row index
			//System.out.println(r1.getPhysicalNumberOfCells());
			
			int numberofrow = s1.getLastRowNum();
			for(int i=0;i<=numberofrow;i++) {
				
				XSSFRow r = s1.getRow(i);
				int numberofcell = r.getLastCellNum();
				System.out.println();
				
				for(int j=0; j<numberofcell; j++) {
					
				XSSFCell c = r.getCell(j);
				System.out.print(c+" ");
				}
			}
			
			wk.close();
			
			
	}

}
