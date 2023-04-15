package core_java;
class PojoSetDemo
{
private int practHrs;
private String hardWork;
private static String name;
private double sal;
public void setPractHrs(int practHrs)
{
this.practHrs=practHrs;
}
public void setHardWork(String hardWork)
{
this.hardWork=hardWork;
}
public void setName(String name)
{
this.name=name;
}
public void setSal(double sal)
{
this.sal=sal;
}
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
public class Pojo_set_Test
{
public static void main(String[] args)
{
PojoSetDemo demo = new PojoSetDemo();
demo.setPractHrs(9);
demo.setHardWork("Never fail");
demo.setName("Edwin Alberto Vargas Montoya");
demo.setSal(125000.5);
System.out.println(demo.getPractHrs());
System.out.println(demo.getHardWork());
System.out.println(demo.getName());
System.out.println(demo.getSal());
}
}


