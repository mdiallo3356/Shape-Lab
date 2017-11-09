package shapes;

public class Square extends Rectangle {

	int side;

	public Square(int side) {
		super(side, side);
	}

	@Override
	public String toString() {
		return "The area of the square is "+calculateArea()+"."+"The perimeter of the square is "+calculatePerimeter()+".";
	}

}
