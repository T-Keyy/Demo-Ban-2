package test;

import java.util.Scanner;

public class KTSoAmDuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s;
		
		System.out.println("Nhập số: ");
		Scanner scanner = new Scanner(System.in);
		s = scanner.nextInt();
	        if(s > 0)
	        {
	            System.out.println(s +" là số dương!!!");
	        }
	        else if(s < 0)
	        {
	            System.out.println(s +" là số âm!!!");
	        }
	        else
	        {
	            System.out.println(s +" không phải là số âm cũng không phải là số dương!!!");
	        }
	    }
	}

