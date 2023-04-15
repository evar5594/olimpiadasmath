package core_java;
class Parent
{
final int practHours = 9;
public void study()
{
System.out.println("PC: study()");
}
public void job()
{
System.out.println("PC: job()");
}
public void play()
{
System.out.println("PC: play()");
}
public void money()
{
System.out.println("PC: money()");
}
}
class Child extends Parent
{
@Override
final public void study()
{
System.out.println("CC: I don't study()");
}
@Override
final public void job()
{
System.out.println("CC: I don't want job()");
}
public void friends()
{
System.out.println("CC: friends()");
}
}
public class OverRidingTest
{
public static void main(String[] args)
{
/*Parent OTParentvar = new Parent();
OTParentvar.study();
OTParentvar.job();
OTParentvar.play();
OTParentvar.money();*/
/*Child OTChildvar = new Child();
OTChildvar.study();
OTChildvar.job();
OTChildvar.play();
OTChildvar.money();
OTChildvar.friends();*/
Parent OTParentvar = new Child();
OTParentvar.study();
OTParentvar.job();
OTParentvar.play();
OTParentvar.money();

}
}
