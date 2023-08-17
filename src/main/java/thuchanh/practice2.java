package thuchanh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class practice2 {

	public static void main(String[] args) throws IOException {

		FileInputStream fs = new FileInputStream("D:\\Eclipse\\Funix_STP_304x\\testdata.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook(fs);
		XSSFSheet s1 = wk.getSheet("Sheet1");
		XSSFRow r1 = s1.getRow(0);
		XSSFCell c1 = r1.getCell(0);
		
		
		int allr = s1.getLastRowNum();
		for(int i=0;i<=allr;i++) {
			
			XSSFRow r = s1.getRow(i);
			int allc = r.getLastCellNum();
			for(int j=0;j<allc;j++) {
				
				XSSFCell c = r.getCell(j);
				System.out.print(c+" ");
				
			}
			System.out.println();
			
		}
		
		try {
			
			Date x = new SimpleDateFormat("dd/MM/yyyy").parse(c1.getStringCellValue());
			System.out.println(x);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(c1.getCellType());
		
		wk.close();
		fs.close();
				
	}

}
