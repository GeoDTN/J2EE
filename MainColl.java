package collpkg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainColl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ArrayList ottimizzato laccesso casuale (basato su array),
			non ottimizzati linserimento e leliminazione
			allinterno della lista (grosso modo equivalente a
			Vector)
		 */
		List<Integer> listaInteri = new ArrayList<Integer>();
		listaInteri.add(5);
		listaInteri.add(2);
		listaInteri.add(9);
		Collections.sort(listaInteri);
		System.out.println("Lista di interi ordinata: ");
		for (int i:listaInteri) {
			System.out.println(i);
		}
		List<Gatto> gatti = new ArrayList<Gatto>();
		gatti.add(new Gatto(1, "Tom"));
		gatti.add(new Gatto(2, "Felix"));
		gatti.add(new Gatto(3, "Star"));
		
		System.out.println("Lista gatti:");
		for (Gatto gatto:gatti) {
			System.out.println(gatto.getName());
		}
		
		// Ordinamento lista gatti
		Collections.sort(gatti, new NomeGattoComparator());
		System.out.println("Lista gatti ordinata:");
		for (Gatto gatto:gatti) {
			System.out.println(gatto.getName());
		}
		
		// Eliminazione del gatto con Id = 2
		/* tramite l'interfaccia Iterator
		 * public interface Iterator<E> {
			boolean hasNext();
			E next();
			void remove	();
			}
		 */
		for (Iterator<Gatto> eG = gatti.iterator(); eG.hasNext();){
			if ((eG.next().getId()) == 2)
				eG.remove();
		}
		System.out.println("Lista gatti senza il numero 2:");
		for (Gatto gatto:gatti) {
			System.out.println(gatto.getName());
		}
		/*
		 * A Set è una Collection che non può contenere elementi duplicati. 
		 */
		int count[] = {34,22,10,60,30,22};
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0;i < 5;i++)
		{
			set.add(count[i]);
		}
		// Visualizza la lista senza il numero 22
		System.out.println(set);
		// Visualizza una lista ordinata
		TreeSet sortedSet = new TreeSet<Integer>(set);
		System.out.println("The sorted list is: ");
		System.out.println(sortedSet);
		System.out.println("The first element is: " + sortedSet.first());
		System.out.println("The last element is: " + sortedSet.last());
	}
}
