import java.util.Scanner;
class CountAlphabetsInEachWord 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for (int j=0;j<arr[i].length() ;j++ )
			{
				char ch=arr[i].charAt(j);
				if(Character.isAlphabetic(ch))
					count++;
			}
			System.out.println(count);
		}
	}
}
