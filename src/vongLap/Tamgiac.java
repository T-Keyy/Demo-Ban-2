package vongLap;

import java.util.Scanner;
public class Tamgiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner scanner = new Scanner(System.in);
		    int hight;
		    System.out.printf("Chi�?u cao của tam giác là: ");
		    hight = scanner.nextInt();
		    for (int i = hight; i >= 1; --i) {
		      for (int j = i; j >= 1; --j) {
		        System.out.print(j+" ");
		      }
		      System.out.println();
		    }
		  }
		}
