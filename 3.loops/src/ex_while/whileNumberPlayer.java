package while_loops_ex;

public class whileNumberPlayer {
	int myNumber;
	whileNumberPlayer(int myNumber){
		this.myNumber=myNumber;
	}
	public void printSquaresUptoLimit() {
		int i=1;
		while(i<=Math.sqrt(myNumber)) {
			if(i*i<myNumber) {
				System.out.println(i*i);
			}
			i++;
		}
	}
	public void printCubesUptoLimit() {
		int i=1;
		while(i<=Math.sqrt(myNumber)) {
			if(i*i*i<myNumber) {
				System.out.println(i*i*i);
			}
			i++;
		}
	}
	public void printTriangle() {
		int i=1;
		int j=1;
		while(i<=myNumber) {
			while(j<i) {
				i++;
				System.out.print(j);
				j++;
			}
		 
		}
	}

}
