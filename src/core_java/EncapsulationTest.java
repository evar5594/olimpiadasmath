package core_java;
class EncapsulationDemo
{
private int practHrs = 9;
private String hardwork = "result";
public void hello()
{
System.out.println(practHrs+" "+hardwork);
}
public int getPractHrs() {
	return practHrs;
}
public String getHardwork() { 
	return hardwork;
}
}
public class EncapsulationTest
{
public static void main(String[] args)
{
EncapsulationDemo demo = new EncapsulationDemo();
demo.hello();
}
}
