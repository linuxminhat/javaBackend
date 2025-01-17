package footballerComparator;

public class footballer {
	String name;
	String footballClub;
	int balloonDor;
	public footballer(String name, String footballClub, int balloonDor) {
		super();
		this.name = name;
		this.footballClub = footballClub;
		this.balloonDor = balloonDor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFootballClub() {
		return footballClub;
	}
	public void setFootballClub(String footballClub) {
		this.footballClub = footballClub;
	}
	public int getBalloonDor() {
		return balloonDor;
	}
	public void setBalloonDor(int balloonDor) {
		this.balloonDor = balloonDor;
	}
	public String toString() {
		return name + "" + footballClub + "" +  balloonDor ;
	}

}
