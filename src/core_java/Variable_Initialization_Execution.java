package core_java;

import java.util.Scanner;

class Variable_Initialization
{
   int practHrs, num;
   String result;
   Scanner getInput = new Scanner(System.in);

   public int through_Console()
   { 
      System.out.println(practHrs+" "+result);
      System.out.println("Enter Number of hours to practice");
      int var1 = getInput.nextInt();
      practHrs = var1;
      System.out.println("The Number of hours to practice is "+var1);
      System.out.println("Enter the result");
      String var2 = getInput.next();
      System.out.println("The result is "+var2);
      return var1;
   }
   public Variable_Initialization()
   {
      System.out.println("Default constructor --> 0 parameter, name equal to class name. Automatically executed with objects creation ");   
   } 
   public void doHardWork()
   {  
      Variable_Initialization otvar4 = new Variable_Initialization(); 
      System.out.println("Do hardwork");
   }
   public Variable_Initialization(int practHrs, String result )
   {
      this.practHrs = practHrs; 
      this.result = result;  
   } 
  /* public Variable_Initialization(int pract, String res )
   {
      practHrs = pract; 
      result = res;  
   } */
   public Variable_Initialization(int num)
   {
      this.num = num;
   }
}
public class Variable_Initialization_Execution 
{
   public static void main(String[] args)
   { 
      System.out.println("Variable Initialization Through Object--> otvar");
      Variable_Initialization otvar = new Variable_Initialization();
      System.out.println(otvar.practHrs+" "+otvar.result);
      otvar.practHrs = 9; 
      otvar.result = "JOB";
      System.out.println(otvar.practHrs+" "+otvar.result);

      System.out.println("Variable Initialization Through Object--> otvar2");
      Variable_Initialization otvar2 = new Variable_Initialization();
      System.out.println(otvar2.practHrs+" "+otvar2.result);
      otvar2.practHrs = 14;
      otvar2.result = "JOB in tata";
      System.out.println(otvar2.practHrs+" "+otvar2.result );

      System.out.println("Variable Initialization Through console");
      Variable_Initialization otvar3 = new Variable_Initialization();
      otvar3.through_Console();

      otvar3.doHardWork();

      System.out.println("Variable Initialization Through constructor");
      Variable_Initialization otvar4 = new Variable_Initialization(18, "JOB AS AUTOMATED TESTER");
      System.out.println("From parameterised constructor (1 int, 1 String) -> "+otvar4.practHrs+" "+otvar4.result);
      Variable_Initialization otvar5 = new Variable_Initialization(27);
      System.out.println("From parameterised constructor (1 int) -> "+otvar5.num);
      Variable_Initialization otvar6 = new Variable_Initialization('a');
      System.out.println("From parameterised constructor (1 char 'a') ...Testing automated promotion -> "+otvar6.num);
   }
}
