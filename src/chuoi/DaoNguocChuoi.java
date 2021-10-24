package chuoi;

import java.lang.*;
import java.io.*;
import java.util.*;
public class DaoNguocChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				 System.out.print("Nhap chuoi: ");
				  Scanner scanner = new Scanner(System.in);
				  String input = scanner.nextLine();

				byte[] strAsByteArray = input.getBytes();

				byte[] result = new byte[strAsByteArray.length];

				for (int i = 0; i < strAsByteArray.length; i++)
					result[i] = strAsByteArray[strAsByteArray.length - i - 1];

				System.out.println(new String(result));
			}
		}