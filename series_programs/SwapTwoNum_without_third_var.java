class SwapTwoNum_without_third_var 
{
	public static void main(String[] args) 
	{
		System.out.println("Before Swapping");
		int a=10,b=20;
		System.out.println(a);
		System.out.println(b);
		a=a+b;
		b=a-b;
		a=a-b;
		//---using multiplacation----
		/*
		a=a*b;
		b=a/b;
		a=a/b;
		*/

		//---using xor-------
		/*
		a=a^b;
		b=a^b;
		a=a^b;
		*/
		System.out.println("After Swapping");
		System.out.println(a);
		System.out.println(b);
	}
}
