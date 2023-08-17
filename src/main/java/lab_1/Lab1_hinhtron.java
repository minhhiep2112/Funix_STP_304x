package lab_1;
import java.util.Scanner;

public class Lab1_hinhtron {
	
	public static void main(String[] args) {
		
		double pi = 3.14f;
		double r;
		double chuvi;
		double dientich;
		
		Scanner nhap = new Scanner(System.in);
		
		System.out.println("Nhap vao ban kinh: ");
		r = nhap.nextDouble();
		
		chuvi = 2*pi*r;
		System.out.println("Chu vi hinh tron la: " + String.format("%.2f", chuvi));
		
		dientich = pi*r*r;
		System.out.println("Dien tich hinh tron la: " + String.format("%.2f", dientich));
		
	}

}
