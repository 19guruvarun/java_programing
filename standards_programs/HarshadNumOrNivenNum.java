import java.util.Scanner;
class HarshadNumOrNivenNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Number");
		int n=sc.nextInt(),temp=n,sum=0;
		while(temp>0){
			sum+=temp%10;
			
			temp/=10;
		}
		if(n%sum==0)
			System.out.println(n+" Harshad  Number or Niven Number");
		else
			 System.out.println(n+ " not a Harshad  Number or Evien Number");

		
	}
}
