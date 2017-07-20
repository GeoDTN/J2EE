package collpkg;

import java.util.Comparator;

public class NomeGattoComparator implements Comparator<Gatto> {
	@Override
	public int compare(Gatto g1, Gatto g2) {
		return g1.getName().compareTo(g2.getName());
	}
}
