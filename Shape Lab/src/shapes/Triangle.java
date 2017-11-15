package shapes;

public class Triangle implements Shape {
	private int Side1;
	private int Side2; 
	private int Side3;
	private int Height;
	
	public Triangle(int Height, int Side1, int Side2, int Side3) {
	

		this.Side1 = Side1;
		this.Side2 = Side2;
		this.Side3 = Side3;	
		this.Height=Height;
		
	}
   public double calculateArea()
   {
	   if((Side1<this.Side2+this.Side3) && (Side2<this.Side1+this.Side3) && (Side3<this.Side1+this.Side2)) {
	   return 0.5*Side1*Height;}
	   else {return 0;}
   }
   public double calculatePerimeter()
   {
	   if((Side1<this.Side2+this.Side3) && (Side2<this.Side1+this.Side3) && (Side3<this.Side1+this.Side2)) {
	   return Side1+Side2+Side3;}
	   else {return 0;}
   }
   public String toString()
   {return "Triangle perimeter is "+this.calculatePerimeter()+" Triangle area is "+this.calculateArea();
	   
   }

}
