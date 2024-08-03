import java.util.Scanner;
class AtmOperations 
{
	public static void main(String[] args) 
	{
		double bal=10000;
		int orPinNum=1234;
		long phno=9573615355l;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter your Phone Number...");
		long enphno=sc.nextLong();
		
		if(phno==enphno)
		{
			
			System.out.println("Please Enter your Pin Number...");
			int enPinNum=sc.nextInt();
			if(orPinNum==enPinNum)
			{
				System.out.println("----WELCOME TO SBI ATM---------");
				System.out.println("Please Enter 1 to Withdraw amount");
				System.out.println("Please Enter 2 for Balance Enquiry");
				System.out.println("Please Enter 3 to Change Pin");
				System.out.println("Please Enter 4 to Deposit amount");
				int digit=sc.nextInt();
				
				switch(digit)
				{ 
					case 1:
							  System.out.println("Please Enter the you want to withdraw");
							  int withdraw=sc.nextInt();
							  if(withdraw<=(bal-1000))
								{
								  System.out.println("Your Sucessfully Withdraw Your Amount");
								  bal=bal-withdraw;
								  System.out.println("Your Available Balance is: "+bal);
								}
								else
									System.out.println("Insufficient Balance amount");
					break;
					
					case 2:					  
							  System.out.println("Your Available Balance "+bal);
					break;

					case 3:	System.out.println("Enter Your Original Pin Number");
							int enPin=sc.nextInt();
						    if(enPin==orPinNum)
							{
							System.out.println("Please Enter new pin"); 
							int newPin=sc.nextInt(); 
							System.out.println("Please Renter new pin");
							int conPin=sc.nextInt();
							if(newPin==conPin)
							{
									System.out.println("Your pin was updated succesfully");
									orPinNum=newPin;
							}
							else
								
									System.out.println("Invalid entry of pin");
							}
								
						
					break;
					case 4:
				 
							  System.out.println("Enter the amount You want to deposit...");
							  int dep=sc.nextInt();
							  bal=bal+dep;
							  System.out.println("Your Amount Deposited Sucessfully.....");
							  System.out.println("Your Total Balance amount "+bal);

						 
					break;
					default:
							  System.out.println("Please Enter a valid option......");
					}
			}
			else
				System.out.println("PIN Number Missmatched");
		
		}
		else
			System.out.println("Phone Number is MissMatched");
	}
}
