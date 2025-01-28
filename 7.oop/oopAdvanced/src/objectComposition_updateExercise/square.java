package objectComposition_updateExercise;

public class square {
	public int length;
	public int width;
	public square(int length,int width) {
		this.length=length;
		this.width=width;
	}
	public int area() {
		return this.length*this.width;
	}
	public int perimeter() {
		return 2*(this.width+this.length);
	}
	public String toString() {
		return String.format("length - %d width - %d area - %d perimeter - %d", 
				length,width,area(),perimeter());
	}

}
