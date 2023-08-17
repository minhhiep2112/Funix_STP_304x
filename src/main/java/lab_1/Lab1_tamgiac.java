package lab_1;
import java.util.Scanner;

public class Lab1_tamgiac {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double d;
		int chuvi;
		double dientich;
		
		Scanner nhap=new Scanner(System.in);
		
		System.out.println("Nhap vao canh thu nhat:");
		a = nhap.nextDouble();
		System.out.println("Nhap vao canh thu hai:");
		b = nhap.nextDouble();
		System.out.println("Nhap vao canh thu ba:");
		c = nhap.nextDouble();
		
		chuvi = (int)(a + b + c) ;
		System.out.println("Chu vi tam giac la: " + chuvi);
		float p = (float)(chuvi/2);
		d = p*(p - a)*(p - b)*(p - c);
		dientich = Math.sqrt(d);
		System.out.println("Dien tich tam giac la: " + dientich);
		
	}

}
