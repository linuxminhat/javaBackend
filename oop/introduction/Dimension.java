//public class Dimension {
//    private int feet;
//    private int inches;
//    
//    public Dimension(int inches) {
//        // TODO: Convert the total inches into feet and inches. One foot is 12 inches.
//        // Store the feet and inches in their respective instance variables.
//        if(inches<0){
//            this.inches = -1;
//            this.feet = -1;
//            
//        }else {
//            this.inches =this.inches;
//            this.feet = this.inches/12;
//        
//    }
//    
//    public int getFeet() {
//        // TODO: Return the value of feet.
//        return this.inches/12;
//    }
//    
//    public int getInches() {
//        // TODO: Return the value of inches.
//        return this.inches;
//    }    
//}
//public class Square {
//
//    private int side;
//
//    public Square(int side) {
//        // TODO: Initialize side with the passed value
//        this.side = side; //pass the argument
//        
//    }
//
//    public int calculateArea() {
//        // TODO: Calculate and return the area of the square
//        if(side<=0){
//        return -1;
//        }else{
//            return side*side;
//        }
//    }
//
//    public int calculatePerimeter() {
//        // TODO: Calculate and return the perimeter of the square
//        if(side<=0){
//        return -1;
//    }else{
//        return 4*side;
//    }
//    }
//}