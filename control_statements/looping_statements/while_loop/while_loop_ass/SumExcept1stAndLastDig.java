import java.util.Scanner;

class SumExcept1stAndLastDig 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0,c=0,temp=n;
		
		while(temp>0){
			c++;
			sum+=(temp%10);
			temp=temp/10;
		}
		int last_d=n%10;
		int fir_d=n/(int)Math.pow(10,c-1);
		int res=sum-(last_d+fir_d);
		System.out.println(res);
			
	}
}

