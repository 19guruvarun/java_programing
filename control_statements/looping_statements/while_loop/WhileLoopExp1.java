import java.util.Scanner;
class WhileLoopExp1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value");
		int a=sc.nextInt();
		System.out.println("Enter ending value");
		int b=sc.nextInt();
		while(a<=b)
		{
			System.out.print(a+" ");
			a++;
			//System.out.print(a++);
		}
	}
}
