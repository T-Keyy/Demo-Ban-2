package ham;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Scanner;
public class PtrinhBac1 {

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập vào số a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào số b: ");
        double b = scanner.nextDouble();
		PtrinhB1(a,b);
	}

}