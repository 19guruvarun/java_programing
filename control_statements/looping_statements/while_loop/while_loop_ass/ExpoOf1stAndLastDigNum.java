import java.util.Scanner;
class ExpoOf1stAndLastDigNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number");
		int n=sc.nextInt(),temp=n;
		int lastDig=n%10,c=0,expo=1;
		while(temp>0){
			c++;
			temp/=10;
		}
		for(int i=1;i<=c-1;i++)
			expo*=10;
		int firstDig=n/expo;
		int resExpo=1;
		for(int i=1;i<=lastDig;i++)
			resExpo*=firstDig;

		System.out.println("Exponentail of 1st digit "+firstDig+" and last digit "+lastDig+" of given number "+n+" is "+resExpo);
	}
}
