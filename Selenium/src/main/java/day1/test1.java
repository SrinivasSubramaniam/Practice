package day1;

public class test1 {
	
	public static void main(String[] args)
	{
		int m[] []= { {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for (int i=0;i<=0;i++)
		{
			for (int j=0;j<4;j++)
			{
				System.out.print(m[i][j]);
			}
		}
		for (int i=1;i<=3;i++)
		{
			for (int j=3;j<=3;j++)
			{
				System.out.print(m[i][j]);
			}
		}
		for (int i=3;i<=3;i++)
		{
			for (int j=2;j>=0;j--)
			{
				System.out.print(m[i][j]);
			}
		}
		for (int i=2;i>0;i--)
		{
			for (int j=0;j<=0;j++)
			{
				System.out.print(m[i][j]);
			}
		}
		for (int i=1;i<=1;i++)
		{
			for (int j=1;j<=2;j++)
			{
				System.out.print(m[i][j]);
			}
		}
		for (int i=2;i<=2;i++)
		{
			for (int j=2;j>0;j--)
			{
				System.out.print(m[i][j]);
			}
		}


	}

}
