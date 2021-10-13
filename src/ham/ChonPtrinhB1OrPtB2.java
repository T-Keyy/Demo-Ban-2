package ham;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ChonPtrinhB1OrPtB2 {

	public static void PtrinhB1(double a, double b) {
		DecimalFormat decimalFormat = new DecimalFormat("#.##");    // làm tròn đến 2 chữ số thập phân
        System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x + " + b + " = 0.");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double nghiem = (double) -b / a;   // ép kiểu để cho ra kết quả chính xác
            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
        }
	}
	private static Scanner scanner = new Scanner(System.in);
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
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chon bac phuong trinh ban muon giai bac nhat(1), bac hai(2): ");
		int luachon = scanner.nextInt();
		if (luachon==1)
		{
			 	System.out.print("Nhap a : ");
			 	double a = scanner.nextDouble();
			    System.out.print("Nhap b : ");
			    double b = scanner.nextDouble();
			    PtrinhB1(a, b);  
		}
		else if (luachon==2)
		{
			System.out.println("Nhap a: ");
			float a = scanner.nextFloat();
			System.out.println("Nhap b: ");
			float b = scanner.nextFloat();
			System.out.println("Nhap c: ");
			float c = scanner.nextFloat();   
			giaiPTBac2(a, b, c);   
		}
	}

}
	
	
	
	