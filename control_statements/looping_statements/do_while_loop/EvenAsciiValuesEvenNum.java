class EvenAsciiValuesEvenNum
{
	public static void main(String[] args) 
	{
		char a='a';
		
		do
		{
			if(a%2==0)
				System.out.println((int)a+" ---> "+a);
			a++;
		}
		while (a<='z');
		
	}
}
