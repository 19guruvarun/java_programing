import java.util.*;

class RemoveSpecialChars 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		String res="";
		for (int i=0;i<s.length() ;i++ )
		{
			char ch=s.charAt(i);
			if(Character.isAlphabetic(ch)||Character.isDigit(ch))
				res+=ch;
		}
		System.out.println(res);
	}
}
