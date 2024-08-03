import java.util.Scanner;
class PowerOfLargeDigit_to_SmallDigit 
{
	public static void main(String[] args) 
	{
		int n=2343;
		int max=n%10,min=n%10;
		
		while(n>0){
			if((n%10)>max)
				max=n%10;
			if((n%10)<min)
				min=n%10;
			n/=10;
		}
		
		int exp=1;
		for(int i=1;i<=min;i++)
			exp*=max;
		System.out.println("min value "+min+" max value "+max+" power of them is "+exp);
	}
}
