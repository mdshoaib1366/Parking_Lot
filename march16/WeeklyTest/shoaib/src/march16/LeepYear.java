package march16;

public class LeepYear {
	public boolean checkPrimeNumber(int year)
	{
		if(year%100!=0 && year%4==0)
		{
			return true;
		}
		return false;
	}
}
