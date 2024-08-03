class SandTime_01 
{
	public static void main(String[] args) 
	{
		int n=7;
		int star=n,space=0;
		for (int r=1;r<=n ;r++)
		{
			for(int j=1;j<=space;j++)
				System.out.print("   ");
			for(int j=1;j<=star;j++)
				System.out.print(" * ");
			System.out.println();
			if(r<(n+1)/2)
			{
				star-=2;
				space++;
			}
			else
			{
				star+=2;
				space--;
			}
		}
	}
}
