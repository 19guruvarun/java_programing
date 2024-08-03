import java.util.Scanner;
class ScannerExpAddTwoNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b values");
		int a=sc.nextInt();
		int b=sc.nextInt();

		System.out.println("Adding of "+a +" and "+b+" is "+(a+b));
	}
}
