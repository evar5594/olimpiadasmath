package core_java;
interface Demo
{
//this is a marker interface it doesn't have any method
}
@FunctionalInterface
interface Demo2
{
   void job();
   public static void subject()
   {
      System.out.println("SUBJECT");
   }
}
@FunctionalInterface
interface Demo3 extends Demo2
{
   public static void accountType()
   {
      System.out.println("ACCOUNT TYPE");
   }
}
interface Demo4 extends Demo3
{
   void job1();
   void job2();
   void job3();
   void job4();
   public static void creditCard()
   {
      System.out.println("CREDIT CARD");
   }
   public static void savingAccount()
   {
      System.out.println("SAVING ACCOUNT");
   }
}
interface Fully
{
   void job5();
   void job6();
   void job7();
   void job8();
}
interface BankAtm
{
   public static final String bankName = "State Bank of India";
   String bankContry = "INDIA";
   public abstract void miniStmt();
   abstract public void cashWitdraw();
   abstract void pinChange();
   void balEnq();
   //void cashDeposit();
  //void accountCreation();
   public static void cashDeposit()
   {
      System.out.println("CASH DEPOSIT");
   }
   default void accountCreation()
   {
      System.out.println("ACCOUNT CREATION");
   }
   // private methods hello1() and hello2() are allow in java 1.9 & onwards
   /*private static void hello1()
   {
      System.out.println("HELLO1");
   }
   private void hello2()
   {
      System.out.println("HELLO2");
   }*/
}
abstract class BankAtmImpl implements BankAtm
{
   @Override
   public void miniStmt()
   {
      System.out.println("MINI STMT");
   }
   @Override
   public void cashWitdraw()
   {
      System.out.println("CASH WITDRAW");
   }
   @Override
   public void pinChange()
   {
      System.out.println("PIN CHANGE");
   }
   @Override
   public void accountCreation()
   {
      System.out.println("MY OWN ACCOUNT CREATION");
   }
   public void hardwork()
   {
      System.out.println("HARD WORK");
   }
}
class BankAtmImplOne extends BankAtmImpl
{
   @Override
   public void balEnq()
   {
      System.out.println("BALANCE ENQUIRE");
   }
   public void job()
   {
      System.out.println("JOB");
   }
  /* @Override
   public void accountCreation()
   {
      System.out.println("MY OWN ACCOUNT CREATION");
   } */ 
} 
public class InterfaceTest
{
   public static void main(String[] args)
   {
      /*BankAtmImplOne otvar = new BankAtmImplOne();
      otvar.miniStmt();
      otvar.cashWitdraw();
      otvar.pinChange();
      otvar.balEnq();
      otvar.hardwork();
      otvar.job();
      String bankNameResp = otvar.bankName;
      System.out.println(bankNameResp);
      String bankNameResp1 = BankAtm.bankName;
      System.out.println(bankNameResp1);*/
      /*BankAtmImpl otvar = new BankAtmImplOne();
      otvar.miniStmt();
      otvar.cashWitdraw();
      otvar.pinChange();
      otvar.balEnq();
      otvar.hardwork();
      //otvar.job();
      String bankNameResp = otvar.bankName;
      System.out.println(bankNameResp);
      String bankNameResp1 = BankAtm.bankName;
      System.out.println(bankNameResp1);*/
      BankAtm otvar = new BankAtmImplOne();
      otvar.miniStmt();
      otvar.cashWitdraw();
      otvar.pinChange();
      otvar.balEnq();
      otvar.accountCreation();
      String bankNameResp = otvar.bankName;
      System.out.println(bankNameResp);
      String bankNameResp1 = BankAtm.bankName;
      System.out.println(bankNameResp1);
      BankAtm.cashDeposit();
   }
}
