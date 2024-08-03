class CheckEligibilityForInterview 
{
	public static void main(String[] args) 
	{
		int year=2024;
		double aggregation=77.61;
		boolean willingToRelocate=true;
		boolean okWithBond=true;
		if(year==2024 && aggregation>=60 && willingToRelocate && okWithBond)
			System.out.println("Eligible for Interview");
		else
			System.out.println("not Eligible for Interview");

	}
}
