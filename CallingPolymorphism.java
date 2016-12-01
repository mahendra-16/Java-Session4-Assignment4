package Session4;

public class CallingPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area poly = new Area();
		
		System.out.println("Area of Square : " + poly.area(15));
		
		System.out.println("Area of Rectangle : " + poly.area(48, 64));
		
	}

}
