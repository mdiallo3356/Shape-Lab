package shapes;

public class Rhombus implements Shape {
 private int side;
 private int diagonal1;
 private int diagonal2;
 
 public Rhombus(int side,int diagonal1,int diagonal2)
 {this.side=side;
 this.diagonal1=diagonal1;
 this.diagonal2=diagonal2;
 }
 
 public double calculateArea()
 {return ((diagonal1*diagonal2)/2);}
 public double calculatePerimeter()
 {return 4*side;}
 public String toString()
 {return "Rhombus area "+this.calculateArea()+" Rhombus Perimeter: "+this.calculatePerimeter();}
}
