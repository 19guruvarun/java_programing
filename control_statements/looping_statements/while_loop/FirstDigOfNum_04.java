import java.util.Scanner;
class FirstDigOfNum_04
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int temp=n,fd=0;
		while(temp>9)
			temp=temp/10;

		System.out.println("First digit  of given number "+n+" is "+temp);
	}
}
