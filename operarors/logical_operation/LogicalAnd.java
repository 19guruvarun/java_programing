class LogicalAnd 
{
	public static void main(String[] args) 
	{
		//output is always boolean values
		int a=20;
		String res=(a%3==0 && a%5==0)?a+" is divisible by both 3 amd 5 ":a+" is not divisible by both 3 amd 5 ";
		System.out.println(res);
	}
}
