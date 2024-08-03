import java.util.*;
class CharCount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		int c1=0,c2=0,c3=0,c4=0;
		for (int i=0;i<s.length() ;i++ )
		{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
				c1++;
			else if(Character.isLowerCase(ch))
				c2++;
			else if(Character.isDigit(ch))
				c4++;
			else if(!Character.isAlphabetic(ch) && !Character.isDigit(ch))
				c3++;
		}
		System.out.println("Uppercase chars "+c1); 
		System.out.println("Lowercase chars "+c2);
		System.out.println("Digit chars "+c4);
		System.out.println("Special chars "+c3);
	}
}
