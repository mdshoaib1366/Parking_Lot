package iron_man.emploee_tcs;

class Sample {
	private static Sample obj;
	
	private Sample()
	{
		
	}
	public static Sample display()
	{
		if(obj == null)
		obj = new Sample();
		return obj;
	}
}
public class SingletonClass{
	public static void main(String[] args) {
//		Sample s = new Sample();
		System.out.println(Sample.display());
		System.out.println(Sample.display());
		System.out.println(Sample.display());
	}
}
