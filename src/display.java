import java.util.Scanner;
import java.lang.Math;
public class display {
	public static void main(String[] args)
	{
		Scanner scrn = new Scanner(System.in);
		int firstNum,first;
		int secondNum,second;
		int i=0,j=0;
		
		System.out.println("Please enter the first number");
		firstNum = scrn.nextInt();
		first= firstNum;
		
		while(firstNum!=0)
		{ 
		   firstNum=firstNum/10;
		   i++;
		}
		 int[] z= new int[i+1];
		System.out.println("Please enter the second number with the same numbers of digits");
		secondNum = scrn.nextInt();
		second= secondNum;
		while(secondNum!=0)
		{ 
		   secondNum=secondNum/10;
		   j++;
		}
	   if(i!=j)
	   {
		   System.out.print("These two numbers don't have same numbers of digits");
	   
	   }
	   else {
		for(int x=0; x<i;x++)
		{
		       z[x]= first % 10 + second % 10;
			    second=second/10;
			    first=first/10;
			   
		   }
		for(int a=0;a<i;a++)
		{
			for(int b=a+1;b<j;b++)
			{
				System.out.println(z[a]==z[b]);
			}
		     }
		
	         }
	  
	  
	}
}

		
	


