package core_java;
class PojoBaseDemo
{
private int practHrs;
private String hardWork;
private static String name;
private double sal;

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


public class Pojo_base_Test {
public static void main(String[] args) {
	PojoBaseDemo demo = new PojoBaseDemo();
	System.out.println(demo.getPractHrs());
	System.out.println(demo.getHardWork());
	System.out.println(demo.getName());
	System.out.println(demo.getSal());
}
}