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
 
 public void printRhombus()
 { if((this.diagonal1>0)&&(this.diagonal2>0)&&(this.diagonal1!=this.diagonal2))
 {calculateArea();
  calculatePerimeter(); 
 }
 else {System.out.println("This is not a rhombus.");}
 }
	 
 public double calculateArea()
  {
	 if((this.diagonal1>0)&&(this.diagonal2>0)&&(this.diagonal1!=this.diagonal2)) {
	 return ((diagonal1*diagonal2)/2);}
	 else {return 0;}
  }
  
 
 public double calculatePerimeter()
 {
	 if((this.diagonal1>0)&&(this.diagonal2>0)&&(this.diagonal1!=this.diagonal2)) {
	 return 4*side;}
	 else {return 0;}
 }
 public String toString()
 {return "Rhombus area "+this.calculateArea()+" Rhombus Perimeter: "+this.calculatePerimeter();}
}
