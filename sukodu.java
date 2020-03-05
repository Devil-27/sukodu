import java.util.Scanner;
public class sukodu
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
System.out.println("enter the size of sukodu");
   int x=sc.nextInt();
   int y=sc.nextInt();
   int count=0;
   int number=0;
   int math=0;
   int num[][]=new int[x][y];
System.out.println("enter the content of sukodu");
   for(int i=0; i<x; i++)
    {
  	for(int j=0;j<y;j++)
	 {
		num[i][j]=sc.nextInt();
	  }
   }
     for(int i=0;i<x;i++)
	{
		for(int j=0;j<y;j++)
		{
			System.out.print(" "+num[i][j]+" ");
			count++;
		}
		if(count==y)
		{
			System.out.println();
			count=0;
		}
	}
	outerloop:
	for(int i=0;i<x;i++)
	{
			for(int j=0;j<y;j++)
			{
				int z=num[i][j];
				for(int k=0;k<x;k++)
				{	
			        	 if(j==k)
			         	{
						continue;
			   	 	}
				
					if(z==num[i][k])
					{
						System.out.println("Wrong in row");
						break outerloop;
					}
				}
			}
		
	}
	d:
	for(int j=0;j<y;j++)
	{
			
			for(int i=0;i<x;i++)
			{
				int n=num[i][j];
				for(int k=0;k<x;k++)
				{
					if(i==k)
				{
					continue;
				}
				if(n==num[j][k])
				{
					System.out.println("wrong in column");
					break d;
				}
		        }	
  	}
 }
}
}