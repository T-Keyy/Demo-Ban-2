package test;

import java.util.Scanner;

public class SoDuNgay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập số: ");
        n = scanner.nextInt();

        System.out.println(getDayName(n));
	}
	 		public static String getDayName(int day) {
	        String dayName = "";
	        switch (day) {
	        
	            case 1: dayName = "Monday"; 
	            break;
	            case 2: dayName = "Tuesday"; 
	            break;
	            case 3: dayName = "Wednesday";
	            break;
	            case 4: dayName = "Thursday";
	            break;
	            case 5: dayName = "Friday"; 
	            break;
	            case 6: dayName = "Saturday"; 
	            break;
	            case 7: dayName = "Sunday"; 
	            break;
	            default:dayName = "Ngày sai";
	        }

	        return dayName;
}
	 		
}
