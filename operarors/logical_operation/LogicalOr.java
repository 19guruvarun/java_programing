class LogicalOr 
{
	public static void main(String[] args) 
	{
		//output is always boolean values
		int a=18;
		String res=(a%3==0 || a%5==0)?a+" is divisible by either 3 or 5 ":a+" is not divisible by either  3 or 5 ";
		System.out.println(res);
	}
}