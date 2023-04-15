package core_java;
class Fp_Men {
public void login()
{
;;;;;;;;;;;;;;;;;
System.out.println("login()");
}
public void clothes()
{
;;;;;;;;;;;;;;;;;;;;;
System.out.println("clothes()");
}
public void logout() {
;;;;;;;;;;;;;;;
System.out.println("logout()");
}
}
class Fp_Women extends Fp_Men 
{
public void gold_jewerly()
{
;;;;;;;;;;;;;;;;;;;;;
System.out.println("gold_jewerly");
}
}
class Fp_Kids extends Fp_Men
{
public void toys()
{
;;;;;;;;;;;;;;;;;;;;;
System.out.println("toys()");
}
}
public class InheritanceTest {
public static void main(String[] args) 
{
//1. creating parent class object
	
	/*
	 * Fp_Men fp_men = new Fp_Men(); fp_men.login(); fp_men.clothes();
	 * fp_men.logout();
	 */
	 //2. creating child class object
		/*
		 * Fp_Women fp_women = new Fp_Women(); fp_women.login(); fp_women.clothes();
		 * fp_women.gold_jewerly(); fp_women.logout();
		 */
//3. creating child class object by using parent class reference
		
		
		  Fp_Men fp_men = new Fp_Women(); 
		  fp_men.login(); 
		  fp_men.clothes();
		  fp_men.logout();
		 //fp_men.gold_jewerly();
	//4. creating parent class object by using child class reference
//	Fp_Women fp_women = new Fp_Men();


}
}
