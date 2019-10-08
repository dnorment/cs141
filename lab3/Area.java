public class Area{

	public double getArea(double radius){ //Circle
		return Math.PI * radius * radius;
	}

	public double getArea(double width, double length){ //Rectangle
		return width * length;
	}

	public double getArea(double radius, int height){ //Cylinder
		return Math.PI * radius * radius * height;
	}

}
