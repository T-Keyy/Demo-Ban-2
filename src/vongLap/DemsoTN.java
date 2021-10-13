package vongLap;

import java.util.Scanner;
public class DemsoTN {
    public static void main(String[] args) {
        int number, count = 0;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào số nguyên dương bất kỳ: ");
        number = scanner.nextInt();
        
        while (number > 0) {
            number /= 10;
            count++; 
        }
         
        System.out.println("Tổng các chữ số = " + count);
    }
 
}

