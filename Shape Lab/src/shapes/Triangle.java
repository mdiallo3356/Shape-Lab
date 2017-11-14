package shapes;

public class Triangle implements Shape {
	private int Base; 
	private int Height;
	private int Side1;
	private int Side2; 
	private int Side3;
	
	public Triangle(int Base, int Height, int Side1, int Side2, int Side3) {
		if(Side1<this.Side2+this.Side3) && (Side2<this.Side1+this.Side3)>
		
		this.Base = Base;
		this.Height = Height; 
		this.Side1 = Side1;
		this.Side2 = Side2;
		this.Side3 = Side3;	
	}
   
	public boolean isTriangle()
	{if(this.Side1+this.Side2>this.Side3)
		return true;
	 if(this.Side2+this.Side3>this.Side1)
		
	}

   public double calculateArea()
   {return 0.5*Base*Height;	   
   }
   public double calculatePerimeter()
   {return Side1+Side2+Side3;	   
   }
   public String toString()
   {return "Triangle perimeter is "+this.calculatePerimeter()+" Triangle area is "+this.calculateArea();
	   
   }

}
