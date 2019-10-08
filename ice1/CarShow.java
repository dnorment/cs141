public class CarShow
{

      public static void main(String[] args)
      {
        Car c1 = new Car("Scion", "XB", 2014);
        Car c2 = new Car(c1);
        Car c3 = new Car();

	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);

        c1.compareYear(c3);

        System.out.println();

        if(c2.equals(c3))
        {
                System.out.println("Equal");
        }
     }

}
