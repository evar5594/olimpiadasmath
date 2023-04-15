package core_java;
abstract class AbstractDemo
{
   public void doHardWork()
   {
      System.out.println("HARDWORK = JOB");
   }
   public void subjectFirstJobNext()
   {
      System.out.println("SUBJECT FIRST JOB NEXT");
   }
   abstract public void job();
   public abstract void subject();
}
abstract class AbstractDemoChild extends AbstractDemo
{
   @Override
   public void subject()
   {
      System.out.println("SUBJECT");
   }
   public void hardWorkNeverFails()
   {
      System.out.println("HARD WORK NEVER FAILS");
   }
}
class AbstractDemoChild2 extends AbstractDemoChild
{
   @Override
   public void job()
   {
      System.out.println("JOB");
   }
   public void salary()
   {
      System.out.println("SALARY");
   }
}  
public class AbstractTest
{
   public static void main(String[] args)
   {
     AbstractDemoChild2 otvar = new AbstractDemoChild2();
      otvar.doHardWork();
      otvar.subjectFirstJobNext();
      otvar.subject();
      otvar.hardWorkNeverFails();
      otvar.job();
      otvar.salary();
      /*AbstractDemoChild otvar = new AbstractDemoChild2();
      otvar.job();
      otvar.doHardWork();
      otvar.subject();
      otvar.hardWorkNeverFails();
      otvar.subjectFirstJobNext();*/
     // AbstractDemoChild otvar = new AbstractDemoChild();
   }
}
