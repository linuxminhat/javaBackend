package breakAndcontinue;

public class tukhoabreak2 {
	public static void main(String[] args) {
		for(int i =1;i<=100;i++) {
			//tu khoa break duoc su dung de stop thuc thi lenh trong vong lap
			//doi voi vong lap ben trong vong lap khac no chi stop vong lap do
			if(i==50) {
				break;
			}
			System.out.println(i);
		}
	}

}
