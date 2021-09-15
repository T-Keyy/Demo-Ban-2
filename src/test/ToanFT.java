package test;

import java.util.Scanner;
public class ToanFT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		int y;
		int n;
		System.out.println("number1");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		System.out.println("number2");
		y = scanner.nextInt();
		if (x>=y) {
			System.out.println("nhap ket qua x - y la:");
			n = scanner.nextInt();
		if ((x-y)==n) {
			System.out.println("Đáp án chính xác!");
		}
		else {
			System.out.println("Đáp án chính xác là: ");
			System.out.println(x-y);
		}
		}
	}

}
