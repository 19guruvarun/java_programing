import java.util.Scanner;
class Print1stHalfOfNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int c=0,temp=n;
		while(temp>0){
			c++;
			temp=temp/10;
		}
		int x=n;
		if(c%2==0){
			int ct=c/2;
			while(ct-->0){
				n=n/10;
			}
		}
		System.out.println("First digit of given number "+x+" is "+(n));
	}
}
