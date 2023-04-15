package core_java;

abstract class ReadOnlyDemo
{
	static int practHours = 9; 
	static String result = "JOB";
	
	static public void hello()
	{
		System.out.println(practHours+"**************************"+result);
	}
}
public class ReadOnlyClassTest
{
	public static void main(String[] args)
	{
		System.out.println(ReadOnlyDemo.practHours);
		System.out.println(ReadOnlyDemo.result);
		ReadOnlyDemo.hello();
	}
}
