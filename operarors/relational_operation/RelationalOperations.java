class  RelationalOperations
{
	public static void main(String[] args) 
	{
		//output is always boolean

		int a=23,b=6;
		//input is num or char datatype only
		System.out.println(a+" > "+b+ " is :"+(a>b));
        System.out.println(a+" < "+b+"1 is :"+(a<b));
		System.out.println(a+" >= "+b+" is :"+(a>=b));
		System.out.println(a+" <= "+b+" is :"+(a<=b));


        //input is any data type
		String s1="Hi",s2="Hi";
		System.out.println("s1 and s2 values are same :"+(s1==s2));
        System.out.println("s1 and s2 values are same :"+(s1!=s2));
	}
}
