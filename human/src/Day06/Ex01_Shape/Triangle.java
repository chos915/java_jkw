package Day06.Ex01_Shape;

// Shape 클래스를 구현하시오.
// Shape 클래스를 상속받아 추상메소드를 오버라이딩 하시오.

public class Triangle extends Shape {

	double width, height;
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		// (가로) x (세로) / 2
		return width * height / 2;
	}

	@Override
	double round() {
		// (정삼각형) : (한변의 길이)*3
		return width * 3;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
}
