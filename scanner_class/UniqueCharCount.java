import java.util.*;
class UniqueCharCount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		boolean f=false;
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					f=false;
					break;
				}
				else
					f=true;
			}
			if(f)
				count++;
		}
		System.out.println(count);
	}
}
