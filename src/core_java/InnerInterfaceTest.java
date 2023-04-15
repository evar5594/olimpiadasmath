package core_java;

interface I1
{
   void hardWork1();
   void hardWork2();

   interface I2
   {
      void hardWork1();
      void hardWork3();
      void hardWork4();
   }
}
class I1Impl implements I1
{
   @Override
   public void hardWork1()
   {
       System.out.println("class I1Impl: hardWork1()");  
   }
   @Override
   public void hardWork2()
   {
       System.out.println("class I1Impl: hardWork2()");  
   }  
}
class I2Impl implements I1.I2
{
   @Override
   public void hardWork1()
   {
       System.out.println("class I2Impl: hardWork1()");  
   }
   @Override
   public void hardWork3()
   {
       System.out.println("class I2Impl: hardWork3()");  
   }
   @Override
   public void hardWork4()
   {
       System.out.println("class I2Impl: hardWork4()");  
   }   
}
class I1I2Impl implements I1,I1.I2
{
   @Override
   public void hardWork1()
   {
       System.out.println("class I1I2Impl: hardWork1()");  
   }
   @Override
   public void hardWork3()
   {
       System.out.println("class I1I2Impl: hardWork3()");  
   }
   @Override
   public void hardWork4()
   {
       System.out.println("class I1I2Impl: hardWork4()");  
   }
   @Override
   public void hardWork2()
   {
       System.out.println("class I1I2Impl: hardWork2()");  
   }  
}
public class InnerInterfaceTest
{
   public static void main(String[] args)
   {
      //I1 otvar = new I1(); --> highly impossible -->I1 is abstract; cannot be instantiated
      I1I2Impl otvar = new I1I2Impl();
      otvar.hardWork1();
      otvar.hardWork2();
      otvar.hardWork3();
      otvar.hardWork4();
   }
}
