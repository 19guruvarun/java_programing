import java.util.Scanner;
class FirstDigOfNum_02 
{
	public static void main(String[] args) 
	{
		//using exponential
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int c=0,temp=n;
		while(temp>0){
			c++;
			temp=temp/10;
		}
		int exc=c-1,exp=1;
		for(int i=1;i<=exc;i++)
			exp*=10;
		int fd=n/exp;
		System.out.println("first digit of given number "+n+" is "+fd);
	}
}
