import java.util.*;
class ReverseWords 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String arr[]=s.split(" ");
		for (int i=0;i<arr.length ;i++ )
		{
			String res="";
			for (int j=0;j<arr[i].length() ;j++ )
			{
				char ch=arr[i].charAt(j);
				res=ch+res;
			}
			arr[i]=res;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
