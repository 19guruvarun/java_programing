import java.util.Scanner;
class DecimalToBinary
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int t=n,x=n,c=0;
		while(t>0)
		{
			int d=t%2;
			if(d==0)
				c++;
			else
				break;
			t/=2;
		}
		int bin=0;
		while(x>0)
		{
			int d=x%2;
			bin=bin*10+d;
			x/=2;
		}

		int revbin=0,expo=1;
		while(bin>0)
		{
			int d=bin%10;
			revbin=revbin*10+d;
			bin/=10;
		}
		for(int i=1;i<=c;i++)
			expo*=10;

		System.out.println(revbin*expo);

	//THIS LOGIC APPLICABLE ONLY FOR ODD DECIMAL VALUES
		/*int bin=0;
		
		while(n>0)
		{
			int rem=n%2;
			bin=bin*10+rem;
			n/=2;
		}
		
		int revbin=0;
		while(bin>0)
		{
			int d=bin%10;
			revbin=revbin*10+d;
			bin/=10;
		}
		System.out.println(revbin);*/




		//----USING STRING METHOD
		/*String s="";
		int c=0;
		while(t>0)
		{
			int rem=t%2;
			if(rem==1)
				c++;
			s=Integer.toString(rem)+s;
			t/=2;
			
		}
		System.out.println("Binary value of "+n+" is "+s+" one's are "+c);

		*/



		//----USING ARRAY------
		/*int [] binaryString=new int[10];
		int index=0;
		while(n>0)
		{
			binaryString[index++]=n%2;
			n/=2;
		}
		for(int i=binaryString.length-1;i>=0;i--)
		{
			System.out.print(binaryString[i]);
		}*/

	}
}
