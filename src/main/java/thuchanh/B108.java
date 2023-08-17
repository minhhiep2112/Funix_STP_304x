package thuchanh;


import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class B108 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fs = new FileOutputStream("D:\\Eclipse\\Funix_STP_304x\\writedata.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook();
		XSSFSheet s1 = wk.createSheet("Result");
		
		
		
		for (int i=0; i<=3;i++) {
			XSSFRow r1 = s1.createRow(i);
			XSSFCell c1 = r1.createCell(0);
			c1.setCellValue("Hello, this is row: "+(i+1));
		
		}
		
		
		wk.write(fs);
		wk.close();
		
	}

}
