package core_java;

class OuterOne
{
   public void doHardWork()
   {
      System.out.println("Outer Class: DO HARD WORK()-> NON-STATIC METHOD");
   }
   public static void job()
   {
      System.out.println("Outer Class: JOB()-> STATIC METHOD");
   }
   class InnerOne
   {
      public void doHardWork1()
      {
         System.out.printf("%s\n%s\t%.3s\n",
                           "class InnerOne --> DO HARD WORK1()---> NON-STATIC CLASS AND NON-STATIC METHOD.",
                           " My Data was catched through Object","-->");
      }
    /* public static void job1()
      {
         System.out.println("OC: JOB STATIC METHOD");
      }*/
   }
   static class InnerTwo
   {
      public void doHardWork2()
      {
         System.out.println("static class InnerTwo --> DO HARD WORK2()-> NON-STATIC METHOD");
      }
      public static void job2()
      {
         System.out.println("static class InnerTwo --> JOB2()-> STATIC METHOD");
      }
   }
}
public class InnerClassTest
{
   public static void main(String[] args)
   {
      /*OuterOne otvarOO = new OuterOne();
      otvarOO.doHardWork();
      //otvarOO.job(); --> is a static method is better access it to class name:
      OuterOne.job(); */

      
     /* OuterOne.InnerTwo otvar = new OuterOne.InnerTwo();
      otvar.doHardWork2();
      OuterOne.InnerTwo.job2();*/

      OuterOne otvar = new OuterOne();
      OuterOne.InnerOne otvar2 = otvar.new InnerOne();
      otvar2.doHardWork1();
      System.out.println("Hello");
   }
  
}
