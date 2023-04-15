package core_java;

class ReAssignmentDemo 
{	
	int practHours = 9; 
	String result = "JOB";
	
	public void hello()
	{
		System.out.println(practHours+"**********PC***************"+result);
	}
}
public class ReAssignmentClassTest extends ReAssignmentDemo
{
	@Override
	public void hello()
	{
		System.out.println(practHours+"**********CC****************"+result);
	}
	public static void main(String[] args)
	{
		ReAssignmentDemo otvar = new ReAssignmentDemo();
		System.out.println(otvar.practHours);
		System.out.println(otvar.result);
		otvar.practHours = 0;
		otvar.result = "NO JOB";
		System.out.println(otvar.practHours);
		System.out.println(otvar.result);
		otvar.hello();
		ReAssignmentDemo otcvar = new ReAssignmentClassTest();
		otcvar.hello();
		
	}
}
