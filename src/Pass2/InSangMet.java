package Pass2;

import java.util.Scanner;

public class InSangMet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);

	        System.out.print("Nhap : ");
	        double inch = input.nextDouble();

	        double  met =inch * 0.0254;
	        System.out.println(inch + "Inch la " + met + " Met");
	    }
	}
