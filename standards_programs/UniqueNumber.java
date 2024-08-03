import java.util.Scanner;
class UniqueNumber 
{
	public static boolean isuniqueNumber(int n){
		int t=0,c=0,x=n;
		while(x>0){
			int dg=x%10;
			t=n;c=0;
			while(t>0){
				int d=t%10;
				if(dg==d)
				{	c++;}
				t/=10;
			}
			if(c>1)
			return false;
			x/=10;
		}
		
		return true;

		/*
		boolean seen[]=new boolean[10];
		while(n>0){
			if(seen[n%10])
				return false;
			seen[n%10]=true;
			n/=10;
		}
		return true;
		2*/
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(isuniqueNumber(n))
			System.out.println(n+" is a unique number");
		else
			System.out.println(n+" is not a unique number");
	}
}
