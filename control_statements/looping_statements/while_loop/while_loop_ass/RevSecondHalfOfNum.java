import java.util.Scanner;
class RevSecondHalfOfNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number");
		int n=sc.nextInt(),c=0,temp=n;
		while(temp>0){
			c++;
			temp/=10;
		}
		if(c%2==0){
			
			int ct=c/2,exp=1;
			for(int i=1;i<=ct;i++)
				exp*=10;
			int secHalf=n%exp;
			
			int rev=0;
			while(secHalf>0){
				rev=rev*10+(secHalf%10);
				secHalf/=10;
			}
			System.out.println("Reversing Second half of number "+n+" is "+rev);
		}
		else
			System.out.println("count of digits is odd number so not possible");
	}
}