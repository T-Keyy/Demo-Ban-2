package ham;

import java.util.Scanner;
public class SoNguyenDuong {
	public static void NText() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên dương n: ");
		int n = scanner.nextInt();
		if(n<=0) {
			System.out.println("Bạn nhập sai!!!M�?i nhập lại: ");
		}else {
			System.out.println("Nhập vào 1 thông điệp: ");
			String chuoi = scanner.next();
			System.out.println("Số thông điệp bạn in ra là: "+n);
			for(int i=0 ; i<n ; i++) {
				System.out.println(chuoi);
			}
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NText();
	}

}
