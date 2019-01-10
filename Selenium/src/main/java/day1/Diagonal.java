package day1;

import static org.junit.Assert.assertArrayEquals;

import java.util.Scanner;

import org.apache.poi.util.ArrayUtil;

public class Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of rows");
		Scanner sc=new Scanner(System.in);
		int rowCount=sc.nextInt();
		int arrSize=((rowCount*rowCount)-rowCount)/2;
		int matrix[] []=new int [rowCount] [rowCount];
		int[] upperDiag=new int[arrSize];
		int[] lowDiag=new int[arrSize];
		int upperDiagSum=0,lowerDiagSum=0;
		int pos1=0,pos2=rowCount-1,k=0,l=0;
		for (int i=0;i<rowCount;i++)
		{
			for (int j=0;j<rowCount;j++)
			{
				System.out.println("Enter the value of matrix row: " + (i+1) +"column: "+(j+1));
				matrix[i] [j]=sc.nextInt();
			}
		}
		
		for (int i=0;i<rowCount;i++)
		{
			for (int j=0;j<rowCount;j++)
			{
				if (matrix[i][j]!=matrix[pos1][pos2])
				if (j<pos2)	
				{
				upperDiagSum=upperDiagSum + matrix [i][j]; 	
				upperDiag[k]=matrix [i][j];
				k++;
				}
				if (j>pos2)	
				{
				lowerDiagSum=lowerDiagSum + matrix [i][j]; 	
				lowDiag[l]=matrix [i][j];
				l++;
				}
			}
			pos1=pos1+1;
			pos2=pos2-1;
			
		}
		System.out.println("Upper Diagonal sum is "+ upperDiagSum);
		System.out.println("Lower Diagonal sum is "+ lowerDiagSum);
		System.out.println("The greatest number of sum is in ");
		if (upperDiagSum>lowerDiagSum)
		{
			for (int i=0;i<arrSize;i++)
			{
				System.out.print(upperDiag[i]+" ");
			}
		}else
		{
			for (int i=0;i<arrSize;i++)
			{
				System.out.print(lowDiag[i]+" ");
			}
			
		}
		

	}

}
