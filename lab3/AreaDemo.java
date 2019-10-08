public class AreaDemo {

	public static void main(String[] args){

		Area circle = new Area();
		System.out.println(circle.getArea(5));

		Area rectangle = new Area();
		System.out.println(rectangle.getArea(2.5, 2.0));

		Area cylinder = new Area();
		System.out.println(cylinder.getArea(3.5, 4));

	}

}
