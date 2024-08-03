import java.util.Scanner;
class  PalindromeNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt(),temp=n,rev=0;
		while(temp>0){
			rev=rev*10+(temp%10);
			temp/=10;
		}
		if(rev==n)
		System.out.println(n+" is a palindrome number");
		else
		System.out.println(n+" is not a palindrome number");
	}
}
