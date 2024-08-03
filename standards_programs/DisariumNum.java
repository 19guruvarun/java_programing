import java.util.Scanner;
class DisariumNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int n=sc.nextInt(),t1=n,sum=0,t2=n,c=0;
		while(t1>0){
			c++;
			t1/=10;
		}
		while(t2>0){
				int d=t2%10;
				int expo=1;
				for(int i=1;i<=c;i++)
					expo*=d;
				sum+=expo;
				t2/=10;
				c--;
		}
		if(sum==n)
			System.out.println(n +" is a disarium number");
		else
			System.out.println(n+" is not a disarium number");
	}
}
