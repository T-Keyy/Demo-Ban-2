package chuoi;

public class ChuyenCharSangString {

		 public static String toString(char[] a)
		    {
		        // Creating object of String class
		        String string = new String(a);
		 
		        return string;
		    }

		    public static void main(String args[])
		    {
		 
		        // Character array
		        char s[] = { 'T', 'u', 'y', 'e', 'n', 'Đ', 'e',
		                     'p', 'T', 'r', 'a', 'i' };
		 
		        // Printing converted string from character array
		        System.out.println(toString(s));
		    }
		}
