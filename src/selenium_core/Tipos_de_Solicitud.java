package selenium_core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tipos_de_Solicitud {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Edwin\\Documents\\java_with_selenium\\workspace\\Java_With_Selenium_In_Real_Time\\Drivers\\chromedriver.exe");
		WebDriver otvardriver = new ChromeDriver();
		otvardriver.manage().window().maximize();
		otvardriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		otvardriver.get("https://udea.edu.co/");
		otvardriver.manage().deleteAllCookies();
		/*String title = otvardriver.getTitle();
		*
		 * System.out.printf("%s\n%s\n", "Desarrollador: Ing. Adalberto Montes",
		 * "Tester: Ing. Edwin Vargas"); System.out.println("Página Web: " + title);
		 * String url = otvardriver.getCurrentUrl(); System.out.println("URL: " + url);
		 * String window = otvardriver.getWindowHandle(); System.out.println("Ventana: "
		 * + window); System.out.println(); System.out.printf("%s\n%s\n%s\n",
		 * "Video Navegación Automática para Manual de Usuario del SIBU (Sistema de Bienestar Universitario) ejecutado de manera exitosa para: "
		 * , "Trámites administrativos", " Tipos de solicitud");
		 */

		WebElement link = otvardriver.findElement(By.xpath("//button[@aria-label='Ingresar'][@id='menu-login-action'][@class='mdl-button login mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent'][@title='Ingresar'][@name='Ingresar'][@data-upgraded=',MaterialButton,MaterialRipple']"));
		link.click();
		
		WebElement linked2 = otvardriver.findElement(By.xpath("//a[@href='/wps/myportal/udea/web/inicio'][@title='Iniciar sesión'][text()='Iniciar sesión']"));
		linked2.click();
		
		WebElement user = otvardriver.findElement(By.id("userLogin"));
		user.clear();
		user.sendKeys("adalberto.montes");
		
		WebElement pass = otvardriver.findElement(By.id("passLogin"));
		pass.clear();
		pass.sendKeys("edilma04");

		Thread.sleep(10000);
		/*
		 * WebElement captcha =
		 * otvardriver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
		 * otvardriver.manage().deleteAllCookies(); //Thread.sleep(2000); captcha.click();
		 * //Thread.sleep(2500);
		 */

		WebElement cnt = otvardriver.findElement(By.xpath("//input[@value='Conectar']"));
		cnt.click();
		

		WebElement lin333 = otvardriver.findElement(By.xpath("//button[@title='Enlaces de Interés']"));
		JavascriptExecutor ajs44 = (JavascriptExecutor) otvardriver;
		ajs44.executeScript("arguments[0].click();", lin333);
		

		WebElement link2 = otvardriver.findElement(By.linkText("Mis aplicaciones"));
		link2.click();
		

		WebElement iframeElement = otvardriver.findElement(By.xpath("//iframe[@src='https://link.udea.edu.co/misapps']"));
		otvardriver.switchTo().frame(iframeElement);
		
		WebElement sibu = otvardriver.findElement(By.xpath("//span[text()='extension']/following::*[60]"));
		sibu.click();
		
		  
	    for (String winHandle : otvardriver.getWindowHandles())
	    { 
		  otvardriver.switchTo().window(winHandle); 
	    }
	  
	  
	    WebElement tramitesAdmon = otvardriver.findElement(By.xpath("//a[@id='opc38'][@target='cont'][text()='Trámites administrativos']"));
	    tramitesAdmon.click();
			 
	    // ******************************************* Tipos de solicitud 
			  
	    WebDriverWait wait = new WebDriverWait(otvardriver, 60); 
	    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[@id='opc43'][@onclick='javascript: abrirOpcion(\"https://asone.udea.edu.co/udea-sibu_adm_front/#/tiposSolTramAdmin\"); setMenuText(\"opc43\")'][@target='cont'][text()='Tipos de solicitud']")));
		WebElement tipoSolicitud = otvardriver.findElement(By.xpath("//a[@id='opc43'][@onclick='javascript: abrirOpcion(\"https://asone.udea.edu.co/udea-sibu_adm_front/#/tiposSolTramAdmin\"); setMenuText(\"opc43\")'][@target='cont'][text()='Tipos de solicitud']"));
		tipoSolicitud.click(); 
			    
		
	   WebElement iframeModulos = otvardriver.findElement(By.xpath("//iframe[@id='cont'][@name='cont'][@src='index.php?app=welcome']"));
	   otvardriver.switchTo().frame(iframeModulos);
				  
	   WebDriverWait waita = new WebDriverWait(otvardriver, 60); 
	   waita.until(ExpectedConditions.elementToBeClickable(By.xpath("//mat-select[@role='listbox'][@formcontrolname='estadoFiltro'][@placeholder='Estado'][@aria-label='Estado']")));
	   WebElement lf = otvardriver.findElement(By.xpath("//mat-select[@role='listbox'][@formcontrolname='estadoFiltro'][@placeholder='Estado'][@aria-label='Estado']"));
	   JavascriptExecutor js4 = (JavascriptExecutor) otvardriver;
	   js4.executeScript("arguments[0].click();", lf); 
	  
	   WebDriverWait waite = new WebDriverWait(otvardriver, 60); 
	   waite.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='mat-option-text'][text()='Inactivo']")));
	   WebElement fi = otvardriver.findElement(By.xpath("//span[@class='mat-option-text'][text()='Inactivo']" ));
	   JavascriptExecutor j4 = (JavascriptExecutor) otvardriver;
	   j4.executeScript("arguments[0].click();", fi); 
	  
		
		  WebDriverWait waiti = new WebDriverWait(otvardriver, 60);
		  waiti.until(ExpectedConditions.elementToBeClickable(By.xpath( "//input[@formcontrolname='nombreFiltro']")));
		  WebElement cf = otvardriver.findElement(By.xpath("//input[@formcontrolname='nombreFiltro']"));
		  JavascriptExecutor aj4 = (JavascriptExecutor) otvardriver;
		  aj4.executeScript("arguments[0].click();", cf); 
		  cf.sendKeys("%est%");
		  
		  
		  WebDriverWait wait1 = new WebDriverWait(otvardriver, 60);
		  wait1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='mat-button-wrapper'][text()='Consultar']"))); 
		  WebElement ask = otvardriver.findElement(By.xpath("//span[@class='mat-button-wrapper'][text()='Consultar']" ));
		  JavascriptExecutor js = (JavascriptExecutor) otvardriver;
		  js.executeScript("arguments[0].click();", ask);
		  
		  WebDriverWait w = new WebDriverWait(otvardriver, 60);
		  w.until(ExpectedConditions.elementToBeClickable(By.xpath( "//button[@type='button'][@class='mat-focus-indicator mat-paginator-navigation-next mat-icon-button mat-button-base'][@aria-label='Next page']")));
		  WebElement ww = otvardriver.findElement(By.xpath("//button[@type='button'][@class='mat-focus-indicator mat-paginator-navigation-next mat-icon-button mat-button-base'][@aria-label='Next page']"));
		  JavascriptExecutor aj = (JavascriptExecutor) otvardriver;
		  aj.executeScript("arguments[0].click();", ww); 
		  
		  WebDriverWait w1 = new WebDriverWait(otvardriver, 60);
		  w1.until(ExpectedConditions.elementToBeClickable(By.xpath( "//button[@type='button'][@class='mat-focus-indicator mat-paginator-navigation-next mat-icon-button mat-button-base'][@aria-label='Next page']")));
		  WebElement ww1 = otvardriver.findElement(By.xpath("//button[@type='button'][@class='mat-focus-indicator mat-paginator-navigation-next mat-icon-button mat-button-base'][@aria-label='Next page']"));
		  JavascriptExecutor aj1 = (JavascriptExecutor) otvardriver;
		  aj1.executeScript("arguments[0].click();", ww1); 
		  
		  
		  WebDriverWait waito = new WebDriverWait(otvardriver, 30);
		  waito.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='mat-table cdk-table mat-elevation-z8'][@role='grid']")));
		  WebElement table = otvardriver.findElement(By.xpath("//table[@class='mat-table cdk-table mat-elevation-z8'][@role='grid']" ));
		  JavascriptExecutor cjs = (JavascriptExecutor) otvardriver;
		  cjs.executeScript("arguments[0].click();", table);
		 
			
			  //Thread.sleep(6000);
			  
			  WebDriverWait wait3 = new WebDriverWait(otvardriver, 60);
			  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
			  "//mat-select[@role='listbox'][@formcontrolname='estadoFiltro'][@placeholder='Estado'][@aria-label='Estado']"
			  ))); WebElement fF = otvardriver.findElement(By.xpath(
			  "//mat-select[@role='listbox'][@formcontrolname='estadoFiltro'][@placeholder='Estado'][@aria-label='Estado']"
			  )); JavascriptExecutor js44 = (JavascriptExecutor) otvardriver;
			  js44.executeScript("arguments[0].click();", fF);
			  
			  
			  
			  WebDriverWait wait4 = new WebDriverWait(otvardriver, 60);
			  wait4.until(ExpectedConditions.elementToBeClickable(By.xpath(
			  "//span[@class='mat-option-text'][text()='Activo']"))); WebElement fa =
			  otvardriver.findElement(By.
			  xpath("//span[@class='mat-option-text'][text()='Activo']"));
			  JavascriptExecutor jjs3 = (JavascriptExecutor) otvardriver;
			  jjs3.executeScript("arguments[0].click();", fa); cf.clear();
			  cf.sendKeys("%comp%");
			  
			 
			  
			  WebDriverWait wait5 = new WebDriverWait(otvardriver, 60);
			  wait5.until(ExpectedConditions.elementToBeClickable(By.
			  xpath("(//button[@class='mat-focus-indicator button-footer mat-raised-button mat-button-base mat-primary'])[1]"
			  ))); WebElement ask1 = otvardriver.findElement(By.
			  xpath("(//button[@class='mat-focus-indicator button-footer mat-raised-button mat-button-base mat-primary'])[1]"
			  )); ask1.click(); 
			  cf.clear(); 
			  cf.sendKeys("%udea%");
			  
			  
			  WebDriverWait wait6 = new WebDriverWait(otvardriver, 60);
			  wait6.until(ExpectedConditions.elementToBeClickable(By.
			  xpath("(//button[@class='mat-focus-indicator button-footer mat-raised-button mat-button-base mat-primary'])[1]"
			  ))); WebDriverWait wait2 = new WebDriverWait(otvardriver, 60);
			  wait2.until(ExpectedConditions.elementToBeClickable(By.
			  xpath("(//button[@class='mat-focus-indicator button-footer mat-raised-button mat-button-base mat-primary'])[1]"
			  )));
			  
			  //Thread.sleep(6000);
			  
			  WebDriverWait wait7 = new WebDriverWait(otvardriver, 60);
			  wait7.until(ExpectedConditions.elementToBeClickable(By.
			  xpath("(//button[@class='mat-focus-indicator button-footer mat-raised-button mat-button-base mat-primary'])[1]"
			  ))); WebElement ask3 = otvardriver.findElement(By.
			  xpath("(//button[@class='mat-focus-indicator button-footer mat-raised-button mat-button-base mat-primary'])[1]"
			  )); JavascriptExecutor ar = (JavascriptExecutor) otvardriver;
			  ar.executeScript("arguments[0].click();", ask3); 
			  cf.clear();
			 
			  //Thread.sleep(2000);
			 
					  
						
				  WebElement lin33 =
				  otvardriver.findElement(By.xpath("//button[@title='Nueva']"));
				  JavascriptExecutor s3 = (JavascriptExecutor) otvardriver;
				  s3.executeScript("arguments[0].click();", lin33); 
				  
				  WebElement use = otvardriver.findElement(By.xpath(
				  "//input[@id='mat-input-2'][@placeholder='Nombre'][@formcontrolname='nombre']"
				  )); use.sendKeys("Tester-->Manual de usuario"); 
				  
				  WebElement us = otvardriver.findElement(By.
				  xpath("//input[@id='mat-input-3'][@placeholder='Tiempo mínimo en días'][@formcontrolname='tiempo']"
				  )); us.sendKeys("17"); 
				  
				  WebElement u = otvardriver.findElement(By.
				  xpath("//input[@id='mat-input-4'][@placeholder='Tiempo mínimo en días'][@formcontrolname='diasAlerta']"
				  )); u.sendKeys("12"); 
				  
				  WebElement uu = otvardriver.findElement(By.
				  xpath("//span[@class='mat-button-wrapper'][text()='Guardar']" ));
				  JavascriptExecutor es33 = (JavascriptExecutor) otvardriver;
				  es33.executeScript("arguments[0].click();", uu); //Thread.sleep(6000);
				  
				  WebElement fFf = otvardriver.findElement(By.xpath(
				  "//mat-select[@role='listbox'][@formcontrolname='estadoFiltro'][@placeholder='Estado']"
				  )); JavascriptExecutor js444 = (JavascriptExecutor) otvardriver;
				  js444.executeScript("arguments[0].click();", fFf); 
				  
				  WebElement faa = otvardriver.findElement(By.
				  xpath("//span[@class='mat-option-text'][text()='Activo']" ));
				  JavascriptExecutor jjs33 = (JavascriptExecutor) otvardriver;
				  jjs33.executeScript("arguments[0].click();", faa); 
				  cf.clear();  
				  cf.sendKeys("%manual%"); 
				  
				  WebElement ask11 = otvardriver.findElement(By.xpath(
				  "//span[@class='mat-button-wrapper'][text()='Consultar']" ));
				  JavascriptExecutor jjs330 = (JavascriptExecutor) otvardriver;
				  jjs330.executeScript("arguments[0].click();", ask11); //Thread.sleep(6000);
				  
				  WebElement uuu = otvardriver.findElement(By.
				  xpath("(//button[@title='Gestionar'][@class='mat-focus-indicator mat-icon-button mat-button-base'])[3]"
				  )); JavascriptExecutor gesti = (JavascriptExecutor) otvardriver;
				  gesti.executeScript("arguments[0].click();", uuu); 
				  
				  
				  WebElement usa = otvardriver.findElement(By.xpath("//mat-select[@role='listbox'][@formcontrolname='estado'][@id='mat-select-1']"));
				  usa.click();
				
				  
				  WebElement useri = otvardriver.findElement(By.xpath("//mat-option[@role='option'][@value='Inactivo'][@id='mat-option-5']"));
				  useri.click();
				  
				  WebElement no = otvardriver.findElement(By.
				  xpath("//span[@class='mat-button-wrapper'][text()='Guardar']" ));
				  JavascriptExecutor es3 = (JavascriptExecutor) otvardriver;
				  es3.executeScript("arguments[0].click();", no); //Thread.sleep(6000);
				  
					
				  WebElement edw = otvardriver.findElement(By.xpath("//input[@placeholder='Use %'][@formcontrolname='nombreFiltro'][@id='mat-input-0']"));
				  JavascriptExecutor j4a = (JavascriptExecutor) otvardriver;
				  j4a.executeScript("arguments[0].click();", edw); 
					  
				  cf.clear();
				  cf.sendKeys("%con%");
					  
				  WebElement on = otvardriver.findElement(By.
				  xpath("//span[@class='mat-button-wrapper'][text()='Consultar']" ));
				  JavascriptExecutor ed = (JavascriptExecutor) otvardriver;
				  ed.executeScript("arguments[0].click();", on); //Thread.sleep(6000);
					 
					 
		 System.out.println("Finish");
	}
}