package test;

import java.util.Scanner;
public class PTrinhB2 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        System.out.print("Nhập a = ");
	        float a = PTrinhB2.scanner.nextFloat();
	        System.out.print("Nhập b = ");
	        float b = PTrinhB2.scanner.nextFloat();
	        System.out.print("Nhập c = ");
	        float c = scanner.nextFloat();
	        PTrinhB2.giaiPTBac2(a, b, c);
	    }

	    public static void giaiPTBac2(float a, float b, float c) {
	        // kiểm tra các hệ số
	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình vô nghiệm!");
	            } else {
	                System.out.println("Phương trình có một nghiệm: "
	                        + "x = " + (-c / b));
	            }
	            return;
	        }
	        // tính delta
	        float delta = b*b - 4*a*c;
	        float x1;
	        float x2;
	        // tính nghiệm
	        if (delta > 0) {
	            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
	            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
	            System.out.println("Phương trình có 2 nghiệm là: "
	                    + "x1 = " + x1 + " và x2 = " + x2);
	        } else if (delta == 0) {
	            x1 = (-b / (2 * a));
	            System.out.println("Phương trình có nghiệm kép: "
	                    + "x1 = x2 = " + x1);
	        } else {
	            System.out.println("Phương trình vô nghiệm!");
	        }
	    }
	}

