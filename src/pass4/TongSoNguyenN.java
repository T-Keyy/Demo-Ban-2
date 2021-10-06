package pass4;

import java.util.Scanner;

public class TongSoNguyenN {
 
    public static void main(String[] args) {
        int number, balance;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào số nguyên dương: ");
        number = scanner.nextInt();
        while (number > 0) {
            balance = number % 10;
            sum += balance;
            number /= 10;
        }
         
        System.out.println("Tổng các chữ số = " + sum);
    }
 
}