package day1;

import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		System.out.println("Enter the text to be printed unique: ");
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		char c='a';
		char[] b = text.replace(" ", "").toLowerCase().toCharArray();
		String output="";
		for (int i=0;i<b.length-1;i++)
		{
		
		System.out.println(output.contains(b[i]+""));
			 if (!output.contains(b[i]+""))
			 {

				 output=output+b[i];
			 }
		}
		System.out.println(output);

		}
		

	}


