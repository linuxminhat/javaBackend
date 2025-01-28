package breakAndcontinue;

public class tukhoacontinue {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i<=50)
			{
//				break;=> print 1 -> 49
				continue;//=> skip
			}
			System.out.println(i);
		}
	}

}
