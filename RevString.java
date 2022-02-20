

import java.io.*;
import java.util.Scanner;

class RevString {
	public static void main (String[] args) {
	
	String str, nstr="";
	char ch;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any String:");
	str=sc.nextLine();
	
	
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); //extracts each character
		nstr= ch+nstr; //adds each character in front of the existing string
	}
	System.out.println("Reversed String: "+ nstr);
	}
}

//Contributed by Tiyasa
