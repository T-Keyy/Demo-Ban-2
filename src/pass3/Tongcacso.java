package pass3;

import java.util.Scanner;
public class Tongcacso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;
        int n;
        Scanner sc;
        do {
        	System.out.println("Nhập n = ");
            sc = new Scanner(System.in);
            n = sc.nextInt();
        }while(n <= 0);
        
        for(int i = 1; i <= n; i++) {
        	sum += i;
        }
        
        System.out.println("Sum = " + sum);
        sc.close();
    }

	}

