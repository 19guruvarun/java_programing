import java.util.Scanner;
class  ArmstrongNum
{
	/*public static int powerOfDig(int n,int c){
		int expo=1;
			for(int i=1;i<=c;i++)
				expo*=n;
		return expo;
	}*/
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a value");
		int n=sc.nextInt(),sum=0,c=0,t1=n,t2=n;
		while(t1>0){
			c++;
			t1/=10;
		}
		System.out.println(c);
		//int cd=(int)Math.log10(n);

		while(t2>0){
			int d=t2%10;
			int expo=1;
			for(int i=1;i<=c;i++)
				expo*=d;
			sum+=expo;
			t2/=10;
		}
		if(sum==n)
					System.out.println(n+" Armstrong Number");
		else
					System.out.println(n+" not a Armstrong Number");

					
	}
}
