import java.util.Scanner;
class AutomarphicNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int n=sc.nextInt(),t=n,c=0,sqr=n*n;
	
		while(t>0){
			c++;
			t/=10;
		}
		int exp=1;
		for(int i=1;i<=c;i++){
			exp*=10;
		}
	
		int lastdigits=sqr%exp;
		if(lastdigits==n)
				System.out.println(n+" Automarphic number");
		else
			System.out.println(n+" not Automarphic number");

	}
}
