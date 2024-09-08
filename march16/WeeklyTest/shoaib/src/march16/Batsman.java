package march16;

public class Batsman {
	public String name;
	public int runs;
	public int matches;
	public float batting_avg;
	
	public void computeBattingAverage()
	{
		if(runs<0 || matches<0)
		{
			System.out.println("ERROR");
		}
		else if(runs>0 && matches==0)
		{
			System.out.println("ERROR");
		}
		else
		{
			this.batting_avg = (float)runs/matches;
			System.out.println("Batting_avg= "+this.batting_avg);
		}
	}
	public void getStatics()
	{
		if(runs<0 || matches<0)
		{
			System.out.println("ERROR");
		}
		else if(runs>0 && matches==0)
		{
			System.out.println("ERROR");
		}
		else
		{
			System.out.println("\nName: "+name);
			System.out.println("Runs: "+runs);
			System.out.println("Matches: "+matches);
			
		}
			
	}
}
