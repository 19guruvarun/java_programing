class PascalTriangel 
{
	public static void main(String[] args) 
	{
		int n=5,star=1,space=n-1;
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=space ;j++ )
			
				System.out.print(" ");
			
			for(int j=1;j<=star;j++)
				System.out.print(" *");
			System.out.println();
			star+=1;
			space--;
		}
	}
}
