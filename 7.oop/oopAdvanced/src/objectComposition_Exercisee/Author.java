package objectComposition_Exercisee;

public class Author {
	public String name;
	public byte sex;//0 for male, 1 for female 
	public String nationality;
	public boolean alive;//true for live and false for die 
	public Author(String name,byte sex,String nationality,boolean alive) {
		this.name=name;
		this.sex=sex;
		this.nationality=nationality;
		this.alive=alive;
	}
	
	

}
