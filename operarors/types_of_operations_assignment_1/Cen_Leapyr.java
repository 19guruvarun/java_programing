class Cen_Leapyr
{
	public static void main(String[] args) 
	{
		int n=3000;
		String res=n%400==0?n +" is a century leap year":n +" is a non century leap year";
		System.out.println(res);
	}
}
