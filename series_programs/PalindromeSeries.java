import java.util.Scanner;
class PalindromeSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start range");
		int start=sc.nextInt();
		System.out.println("Enter the end range");
		int end=sc.nextInt();
		for(int n=start;n<=end;n++){
			int rev=0,temp=n;
			while(temp>0){
				rev=rev*10+(temp%10);
				temp/=10;
			}
			if(rev==n)
				System.out.print(n+" ");
		}
		System.out.println();
	}
}
