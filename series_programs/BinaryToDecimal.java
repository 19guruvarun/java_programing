import java.util.Scanner;
class BinaryToDecimal 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary value");
		int binNum=sc.nextInt();
		int t=binNum,c=0;
		int res=0;
		while(binNum>0)
		{
			int d=binNum%10;
			int expo=1;
			for(int i=0;i<c;i++)
				expo*=2;
			res=res+(d*expo);
			binNum/=10;
			c++;
		}
		System.out.println(res);
		
	}
}
