package footballerComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class rankingBalloonDorNumber implements Comparator<footballer> {

	@Override
	public int compare(footballer o1, footballer o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getBalloonDor(), o2.getBalloonDor());
	}
	
}

public class footballerRunner {
	public static void main(String[] args) {
		//footballer(String name, String footballClub, int balloonDor)
		List<footballer> myListFootballer = List.of(new footballer("Messi","Barca",8),
				new footballer("Ronaldo","Real",5),
				new footballer("Neymar","PSG",0));
		ArrayList<footballer> myArrayListFootballer = new ArrayList<footballer>(myListFootballer);
		System.out.println(myArrayListFootballer);
		Collections.sort(myArrayListFootballer, new rankingBalloonDorNumber());
	}

}
