package myobj;

import java.util.Comparator;

public class PeachEngComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Peach p1 = (Peach)o1;
		Peach p2 = (Peach)o2;
		
		
		if (p1.enName.compareTo(p2.enName) > 0) {
			return 1;
		} else if (p1.enName.compareTo(p2.enName) < 0) {
			return -1;
		} else {
			return 0;
		}
		
	}

}
