import java.util.Scanner;
class StringViceVersa 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String res="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
			
				ch=Character.toLowerCase(ch);
			
			else
				ch=Character.toUpperCase(ch);
			res+=ch;
		}
		System.out.println(res);
	}
}
