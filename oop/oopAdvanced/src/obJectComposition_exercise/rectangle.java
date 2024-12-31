package obJectComposition_exercise;

public class rectangle {
	public int length;
	public int width;
	public String color;
	public int square;
	public void setLength(int length) {
		this.length=length;
	}
	public int getLength(int length) {
		return length;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public int getWidth(int width) {
		return width;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor(String color) {
		return color;
	}
	//declare a constructor 
	public rectangle(int length, int width, String color) {
		this.length=length;
		this.width=width;
		this.color=color;
	}
	//write calculate square function
	public int square(int length, int width) {
		return this.square= this.length*this.width;
	}
	//toString function
	public String toString() {
		return "length"+length+"width"+width+"color"+color+"square"+square;
	}

}
