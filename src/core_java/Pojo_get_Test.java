package core_java;

class Pojo_get_Demo
{
	private int practHrs = 9; //declaration and initialization in a single line
	private String hardWork = "result"; 
	private static String name = "RAMESHSOFT";
	private double sal = 125000;
	
	public int getPractHrs()
	{
		return practHrs;
	}
	public String getHardWork()
	{
		return hardWork;
	}
	public static String getName()
	{
		return name;
	}
	public double getSal()
	{
		return sal;
	}
}


public class Pojo_get_Test {
public static void main(String[] args) {
	Pojo_get_Demo demo = new Pojo_get_Demo();
	System.out.println(demo.getPractHrs());
	System.out.println(demo.getHardWork());
	System.out.println(demo.getName());
	System.out.println(demo.getSal());
}
}
