import java.util.*;
class  Print1stHalfOfNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int c=0,temp=n;
		while(temp>0){
			c++;
			temp/=10;
		}
		if(c%2==0){
			int expo=1;
			for(int  i=1;i<=(c/2);i++)
				expo*=10;
			int firstHalf=n/expo;
		System.out.println("First half of given number "+n+" is "+firstHalf);

		}
		else
			System.out.println("odd values cant be divided");
	}
}
