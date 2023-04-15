package core_java;
class OverLoadingDemo
{
/*public int addition(int num1, int num2)
{
int result = num1 + num2;
System.out.println("int int Result is "+result);
return result;  
}
public float addition(float num1, float num2)
{
float result = num1 + num2;
System.out.println("float float Result is "+result);
return result;  
}*/
public double addition(double num1, double num2)
{
double result = num1 + num2;
System.out.println("double double Result is "+result);
return result;  
}
public long addition(long num1, long num2)
{
long result = num1 + num2;
System.out.println("int int Result is "+result);
return result;  
}
} 
public class OverLoadingTest
{
public static void main(String[] args)
{
OverLoadingDemo objtypevar = new OverLoadingDemo();
objtypevar.addition(-75,0);
objtypevar.addition(-238,1);
objtypevar.addition(75,225);
objtypevar.addition('a','b');
objtypevar.addition(75012.23568f,225225.23568f);
objtypevar.addition(7599.23,9999.2356);
}
}
