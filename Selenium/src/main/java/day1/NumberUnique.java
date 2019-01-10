package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class NumberUnique {

	public static void main(String[] args) {
		System.out.println("Enter the numbers printed unique: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String stext = Integer.toString(n);

		LinkedHashSet<Character> uniqueChars=new LinkedHashSet<>();
		for (int i=0;i<stext.length();i++)
		{
			char c = stext.charAt(i);
			uniqueChars.add(c);
		}
		
		List<Character> list=new ArrayList<>(uniqueChars);
		Collections.sort(list);
		for (Character character : list) {
			
			System.out.print(character);
		}
		
		
		/*String text=sc.nextLine();
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

		}*/
		

	}


	}

