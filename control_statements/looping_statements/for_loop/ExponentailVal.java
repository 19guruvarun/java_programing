import java.util.Scanner;
class ExponentailVal 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base value");
		int base=sc.nextInt();
		System.out.println("Enter the power value");
		int pow=sc.nextInt(),exp=1;
		for(int i=1;i<=pow;i++)
		{
				exp*=base;
		}
		System.out.println("The exponential val for the base "+base+" to the power "+pow+ " is "+exp);
	}
}
