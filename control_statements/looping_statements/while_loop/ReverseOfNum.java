import java.util.Scanner;
class ReverseOfNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int rev=0,temp=n;
		while(temp>0){
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println("Reverse of given number "+n+" is "+rev);
	}
}
