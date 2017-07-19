/*
*exampleStart.java
*
*
*/

package firstpkg;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class EsempioIni {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Esempio 1
		/*
		 * commento1
		 * commento2
		 * commento3
		 */
		System.out.println("Ciao");
		
		// Esempio 2
		// Inserire i parametri in Run Configuration
		if (args.length != 1)
			System.out.println("Numero Parametri non corretto");
		else {
			System.out.println("Hello " + args[0]);
		}
		//final il dato nn puo essere modificato durante l'esecuzione del programma
		// Esempio 3
		final double Unità_PER_METRO = 100;
		double larghezzaTavolo = 3;
		double altezzaTavolo     = 1.5;
		System.out.println("Dimensione tavolo in Centimetri: " + larghezzaTavolo
			* Unità_PER_METRO + " by " + altezzaTavolo * Unità_PER_METRO);
		
		// Esempio 4
		System.out.println(3 + 5); // stampa 8
		System.out.println(17 / 2); // stampa 8
		// modulo: resto della divisione intera (stampa 1)
		System.out.println(9 % 2);
		System.out.println(19.0 / 2); // stampa 9.5
		 int i  = 1;
		i += 9; //uguale a i = i + 9
		System.out.println(i); // stampa 10
		//Operatore di incremento
		// 1) prima stampa e poi incrementa
		// 2) prima incrementa e poi stampa
		// 3) prima decrementa e poi stampa
		int n = 15;
		System.out.println(n++); // stampa 15 e dopo n vale 16
		System.out.println(++n); // stampa 17
		System.out.println(--n); //  stampa 16
		
		// Esempio 5
		String s1 = ""; // stringa vuota (non null!)
		String s2 = "Ciao";
		String s3 = s2.substring(0, 3); // prende i primi tre caratteri della stringa s2
		System.out.println(s3); // Stampa "Cia"
		s3 += "o Mario"; // stringhe concatenate
		System.out.println(s3); // Visualizza Ciao Mario
		System.out.println(s2); // Visualizza "Ciao"
		
		// Esempio 6
		// Definizione di una variabile della classe Scanner che punta al
		// buffer di input
		Scanner in = new Scanner(System.in);
		System.out.print("Dove abiti? ");
		// Legge una stringa in ingresso
		String luogo = in.nextLine();
		System.out.print("in via ");
		// Legge una stringa in ingresso
		String via = in.nextLine();
		System.out.print("Numero civico? ");
		// Legge un numero in ingresso
		int num = in.nextInt();
 
		System.out.println("Ciao. Io abito a  " + luogo + " in via " + via + 
				"  al numero civico "  + num);
		
		// Esempio 7
		// dichiarazione e istanza un array di interi da 50 elementi
		int[] vet = new int[50];
 
		// ciclo e valorizzo l'array con gli interi da 0 a 49
		for (int x = 0; x < 50; x++)
			vet[x] = x;
		// visualizzo il contenuto dell'array tenendo conto che ciclo sulla lunghezza 		
		// dell'array identificata da vet.length
		for (int y = 0; y < vet.length; y++)
			System.out.println(vet[y]);
		
		// Esempio 8 (if)
		int target = 20;
		int totale = 12;
		// Se il totale è maggiore dell'obbiettivo viene visualizzata la stringa
		// Obbiettivo raggiunto
		// altrimenti viene eseguito il blocco dell'istruzione else
		if (totale >= target)
		{		
			System.out.println("Obbiettivo raggiunto!");
		}
		else
		{
			System.out.println("Obbiettivo fallito!");
			System.out.println("ritenta");
		}
		
		// Esempio 9 (while)
		int contatore = 1;
	    int quad = 0;
	    while (contatore < 6) {
	    	quad = contatore * contatore;
	         System.out.println("Count is: " + quad);
	         contatore++;
	    }
	    
	    // Esempio 10 (for)
	    // vengono visualizzati i numeri da 1 a 6
 		for (int x = 1; x <= 6; x++)
    			System.out.println(x);
 		// conto all'indietro da 6 a 1
 		for (int y = 9; y > 0; y--)
    			System.out.println("Conto all'indietro . . . " + y);

 		// Esempio 11 (foreach)
 		int[] elements = {1, 1, 2, 3, 5, 8, 13, 21};
		// Per ogni element dell'insieme definito elements 
		// eseguire il ciclo
		for (int element : elements) {
			System.out.println(element);
		}
		
		//Esempio 12 (switch)
		in = new Scanner(System.in);
		System.out.print("Seleziona un'opzione (2, 4, 6, 8) ");
		int opzione = in.nextInt();
		switch (opzione)
		{
   			case 2:
			{
				System.out.print("Seleziona Hai selezionato 2 ");
			}
            			break;
			case 4:
			{
				System.out.print("Seleziona Hai selezionato 4 ");
			}
            			break;
			case 6:
			{
				System.out.print("Seleziona Hai selezionato 6 ");
			}
            			break;
			case 8:
			{
				System.out.print("Seleziona Hai selezionato 8 ");
			}
            			break;
   			
			default:
			{
				System.out.print("Non hai selezionato nessuna delle opzioni");
			}
      				break;
		}

		// Esempio 13 (switch senza break)
		in = new Scanner(System.in);
		System.out.print("Seleziona un'opzione (2, 4, 6, 8) ");
		opzione = in.nextInt();
		switch (opzione)
		{
   			case 2:
			{
				System.out.print("Seleziona Hai selezionato 2 ");
			}
            			break;
			case 4:
			{
				System.out.print("Seleziona Hai selezionato 4 ");
			}
            			break;
			case 6:
			{
				System.out.print("Seleziona Hai selezionato 6 ");
			}
            			
			case 8:
			{
				System.out.print("Seleziona Hai selezionato 8 ");
			}
            			break;
   			
			default:
			{
				System.out.print("Non hai selezionato nessuna delle opzioni");
			}
      				break;
		}
		
		// Esempio 14 (for con break)
        int[] vettorediInteri = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int numero = 50;
        int ii;
        // Quando viene trovato il valore 50 viene settata a true la variabile trovato ed inoltre
        // si esce dal ciclo for tramite il break
        boolean trovato = false;
        for (ii = 0; ii < vettorediInteri.length; ii++) {
            if (vettorediInteri [ii] == numero) {
                trovato = true;
                break;
            }
        }
        if (trovato) {
            System.out.println("Found " + numero + " at index " + ii);
        } else {
            System.out.println(numero  + " not in the array");
        }

        // Esempio 15 (for continue)
        String seqNumeri = "13279562345361";
        int lun = seqNumeri.length();
        int x = 0;
        int conta = 0;
 
        for (x = 0; x < lun; x++) {
            // mi interessano solo le lettere a minuscole
            if (seqNumeri.charAt(i) != '3')
                continue;
            conta++;
        }
        System.out.println("Trovate " + conta + " ricorrenze '3' nella sequenza.");

        // Esempio 16 trovare la stringa più lunga
        String uno     = "aaa";
        String due     = "bbbb";
        String tre     = "c";
        String quattro = "ddddddd";
        int L1=uno.length(),L2=due.length(),L3=tre.length(),L4=quattro.length();
        int max;
        if((L1>L2) && (L1>L3) && (L1>L4))
        	max = 1;
        else
        {
        	if((L2>L3) && (L2>L4))
        		max = 2;
        	else
        	{
        		if(L3>L4)
        			max = 3;
        		else
        			max = 4;
        	}
        }
        
        // Esempio 17 sostituire un carattere con un altro
        // all'interno di una stringa di caratteri
        String text = "Cambio le o con le u";           
        text = text.replace('o', 'u');
        System.out.println("Result: " + text);
        
        // Esempio 18
        String alf = "osxo";
        int L=alf.length();
       
        int dim=alf.length(); 
        String palindroma = "si"; 
        for (int ix=0; ix<=dim/2; ix++)
        { 
        	if ( alf.charAt(ix) != alf.charAt(dim-1-ix))
        	{ 
        		palindroma="no";  
        	}
        } 
        System.out.println("Result: " + palindroma);
        
        // Esempio 19 dato un vettore trovare se la somma dei numeri pari
        // è maggiore dei numeri dispari
        String vetnum = "327892";
        boolean ris = false;
        if (calvet(vetnum))
        {
        	System.out.println("La somma dei numeri pari è >= dei dispari");
        }
        else
        {
        	System.out.println("La somma dei numeri pari è < dei dispari");
        }	
        
        // Esempio 20 dato un vettore trovare la stringa che ha
        // lunghezza maggiore
        String vetstr[] = new String[3];
        int L1x;
        int L2x;
        int L3x;
        String unox = "uno";
        String duex = "dueduedueq";
        String trex = "tretretre";
        
        vetstr[0] = uno;
        vetstr[1] = due;
        vetstr[2] = tre;
        
        L1x = vetstr[0].length();
        L2x = vetstr[1].length();
        L3x = vetstr[2].length();
        if (L1x >= L2x)
        {
        	if (L1x >= L3x)
        	{
        		System.out.println("Stringa 1 maggiore");
        	}
        	else
        	{
        		System.out.println("Stringa 3 maggiore");
        	}
        }
        else
        {
        	if (L2x >= L3x)
        	{
        		System.out.println("Stringa 2 maggiore");
        	}
        	else
        	{
        		System.out.println("Stringa 3 maggiore");
        	}
        }
        
        // Esempio 21 trasformare una stringa letta in input
        // in caratteri maiuscoli
		Scanner st = new Scanner(System.in);
		String stR = st.nextLine();
		String stM = stR.toUpperCase();
		
		System.out.println("Stringa in maiuscolo " + stM);
		
		// Esempio 22 trovare la data di domani
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
	
	private static boolean calvet(String V)
	{
		boolean R = false;
		int q;
		String NumS;
		int Num;
		int SommaPari = 0;
		int SommaDispari = 0;
		int LungStr = V.length();
		for (int i = 0;i <= LungStr-1;i++)
		{
			q = i % 2;
			NumS = V.substring(i, i+1);
			Num  = Integer.parseInt (NumS);
			if (q == 0)
			{				
				SommaPari += Num;
			}
			else
			{
				SommaDispari += Num;
			}
		}
		if (SommaPari >= SommaDispari)
			return true;
		else
			return false;
	}
}
    
