package core_java;

class Father
{
int practHours = 9;
String result = "Java Programmer";
void test()
{
System.out.println(practHours+"*********PC*****************"+result);
}	
}
class Son extends Father
{
@Override
protected void test()
{
System.out.println(practHours+"***********CC***************"+result);
}
}

public class PublicProtectedDefaultPrivate
{
public static void main(String[] args)
{
Father otvar = new Father();
otvar.test();	
}
}
