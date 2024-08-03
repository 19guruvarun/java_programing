import java.util.Scanner;
class StringFabonaciiCheck 
{
	public static boolean fabNum(int n)
	{
		boolean isFound=false;
		if(n==0||n==1)
			isFound=true;
		int a=0,b=1,c=0;
		while(c<n)
		{
			a=b;
			b=c;
			c=a+b;

		}
		return c==n;
			
	}
	public static int sum(int n)
	{
		int s=0;
		while(n>0)
		{
			s+=n%10;
			n/=10;
		}
		return s;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int charsum=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			charsum+=ch;
		}
		System.out.println(charsum);
		while(charsum>9)
		{
			charsum=sum(charsum);
		}
		System.out.println(charsum);
		if(fabNum(charsum))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
