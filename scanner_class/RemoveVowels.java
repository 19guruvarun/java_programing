import java.util.*;
class RemoveVowels 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		String temp=s.toUpperCase();
		String res="";
		for (int i=0;i<temp.length() ;i++ )
		{
			char ch=temp.charAt(i);
			if (ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U')
			{
				res+=ch;
			}
		}
		System.out.println(res);
	}
}
