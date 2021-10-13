package vongLap;

import java.util.Scanner;
public class TinhGT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhập number cần tìm giai thừa: ");
	int number = scanner.nextInt();
	        long fact = 1;
	        for(int i = 1; i <= number; i++)
	        {
	            fact = fact * i;
	        }
	        System.out.println("Giai thừa của "+number+" là: "+fact);
	}

}
