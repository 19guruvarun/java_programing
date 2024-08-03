import java.util.*;
class FindVowels 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t=s.toUpperCase();
		int c=0;
		for(int i=0;i<t.length();i++)
		{
			char ch=t.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				c++;
		}
		System.out.println(c);
		System.out.println(s);
	}
}
