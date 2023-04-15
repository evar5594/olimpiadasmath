package core_java;

class Constructor_Calls_Test1
{
   public Constructor_Calls_Test1()
   {
      super();
      System.out.println("Parent class->Default Constructor_Calls_Test1()--> 0 parameter, name equal to class name. Automatically executed with objects creation ");
   }
}
class Constructor_Calls_Test extends Constructor_Calls_Test1
{
   public Constructor_Calls_Test()
   {
      //super();
      this("Java Certification 2023");
      System.out.println("Child class->Default Constructor_Calls_Test()--> 0 parameter, name equal to class name. Automatically executed with objects creation ");
   }
   public Constructor_Calls_Test(String str)
   {
      super();
      System.out.println("Child class->Parameterized Constructor_Calls_Test(1 String), name equal to class name. "+str);
   }
}
class Constructor_Two
{
   int id = 1031940251;
   String result = "JOB UNAL MEDELLIN";

   public void hardWork()
   {
      int id = 32303127;
      String result = "JOB AS PROFESSOR";
      System.out.println("Method level variables's values are: "+id+" "+result);
      System.out.println("class Constructor_Two level variables's values are: "+this.id+" "+this.result);
   }
}
class Constructor_One extends Constructor_Two
{
   int id = 43561370;
   String result = "JOB IN LONDON";

   public void hello()
   {
      int id = 98593938;
      String result = "JOB IN TATA";
      System.out.println("Method level variables's values are: "+id+" "+result);
      System.out.println("Class level variables's values are: "+this.id+" "+this.result);
      System.out.println("Super Class level variables's values are: "+super.id+" "+super.result);
      super.hardWork();
   }
}
public class Constructors_Execution
{
   public static void main(String[] args)
   {
      Constructor_One otvar = new Constructor_One();
      otvar.hello();
      Constructor_Calls_Test otvar2 = new Constructor_Calls_Test();
     // Constructor_Calls_Test otvar3 = new Constructor_Calls_Test("Java Certification 2023");   
   }
}
