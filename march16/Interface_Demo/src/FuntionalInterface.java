import java.util.function.Consumer;
import java.util.function.Predicate;

interface India 
{
	int add(int a, int b);
	static int sub(int a, int b)
	{
		return a-b;
	}
}
public class FuntionalInterface {
	public static void main(String[] args) {
		India i =(a,b)->a+b;
		System.out.println(i.add(5, 3));
		System.out.println(India.sub(5, 3));
		Predicate<String>p=str->str.length()==5;
		System.out.println(p.test("India"));
		Consumer<String> c1=str->System.out.println("Love You "+str);
		c1.accept("Maa");
		
	}
}

