import java.util.Scanner;
class ScannerExp01 
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Name");
			String myName=sc.next();
			System.out.println("Enter Your Age");
			int age=sc.nextInt();
			System.out.println("Enter Your Gender ");
			char gender=sc.next().charAt(0);
			System.out.println("Enter Your Phone Number");
			long phno=sc.nextLong();
			System.out.println("Name "+myName+"\n Age "+age+"\n Gender "+gender+"\n Phone Number"+phno);
	}
}
