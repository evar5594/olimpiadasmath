package core_java;
class Padre
{
static void studying()
{
System.out.printf("%s\n%s\n","PC: hiding method:", "execution happens or run in reference type area study()");
}
void working()
{
System.out.println("PC: job()");
}
public void playing()
{
System.out.println("PC: play()");
}
protected void cash()
{
System.out.println("PC: money()");
}
}
class Hijo extends Padre
{
static protected void studying()
{
System.out.println("CC: I don't study()");
}
@Override
protected void working()
{
System.out.println("CC: I don't want job()");
}
final public void friends()
{
System.out.println("CC: friends will be friends()");
}
@Override
public void cash()
{
System.out.println("CC: money get away()");
}

}
public class HidingMethodTest
{
public static void main(String[] args)
{
/*Parent OTParentvar = new Parent();
OTParentvar.study();
OTParentvar.job();
OTParentvar.play();
OTParentvar.money();
Child OTChildvar = new Child();
OTChildvar.study();
OTChildvar.job();
OTChildvar.play();
OTChildvar.money();
OTChildvar.friends();*/
Padre OTParentvar = new Hijo();
OTParentvar.studying();
OTParentvar.working();
OTParentvar.playing();
OTParentvar.cash();
}
}
