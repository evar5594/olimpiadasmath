package core_java;

class Blocks_Implementation
{
   static
   {
      System.out.println("Parent class Static Block");
   }
   //instance block
   {
      System.out.println("Parent class INSTANCE Block");
   }
   public Blocks_Implementation()
   {
      System.out.println("Parent class Default Constructor");
   }
}
public class Static_Instance_Blocks_Execution extends Blocks_Implementation 
{
   static
   {
      System.out.println("Child class Static Block");
   }
   //instance block
   {
      System.out.println("Child class INSTANCE Block");
   }
   public Static_Instance_Blocks_Execution()
   {
      System.out.println("Child class Default Constructor");
   }
   public static void main(String[] args)
   {
      System.out.println("Java Virtual Machine");    
      Static_Instance_Blocks_Execution otvar = new Static_Instance_Blocks_Execution();  
   }
}
