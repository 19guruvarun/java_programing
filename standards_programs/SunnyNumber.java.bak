import java.util.Scanner;
class SunnyNumber 
{
	public static boolean isPerfectSquare(int n){
		
		for(int i=1;i*i<=n;i++){
			if(i*i==n)
			{	return true;
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(isPerfectSquare(n+1))
			System.out.println(n+" is a sunny number");
		else
			System.out.println(n+" is not a sunny number");
	}
}
