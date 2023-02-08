package myobj;

import java.util.Comparator;

public class PeachPriceComparator implements Comparator<Peach> {

	@Override
	public int compare(Peach o1, Peach o2) {
		return o1.price - o2.price; // 양수냐 음수냐 같냐 검수
	}
	
//	@Override
//	public int compare(Peach o1, Peach o2)
//		if (o1.price > o2.price) {
//			return -1;
//		} else if (o1.price < o2.price) {
//			return 1;
//		} else {
//			return 0;
//		}
	
}

