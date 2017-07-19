/*
*exampleStart2.java
*
*
*/
package firstpkg;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EsempioIni2 {

	/**
	 * @param args
	 */
	// Esempio di gestione date in java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar calendar = new GregorianCalendar();

		//add one day
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		
		int year   = calendar.get(Calendar.YEAR);  
		int mounth = calendar.get(Calendar.MONTH); 
		int day    = calendar.get(Calendar.DAY_OF_MONTH); 
		
		String dayS    =  Integer.toString (day); 
		String mounthS =  Integer.toString (mounth); 
		String yearS   =  Integer.toString (year); 
		System.out.println("Domani " + dayS + "/" + mounthS + "/" + yearS);
	}
	
	
}
    
