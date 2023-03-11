package oopsDay1.withbusinessmethods;

public class CarFactory {

	public static void main(String[] args) {
		Car jag = new Car("yellow", 40000000, "Toyot", "Innova"); // objection creation
		jag.start();
		jag.changeGear(1);
		jag.stop();
		//System.out.println(jag.hashCode());	
		//System.out.println(Integer.toHexString(jag.hashCode()));
//		System.out.println(jag);
		//jag.setColor("Red");
//		jag.setPrice(3000000);
//		jag.setBrand("Jagur");
//		jag.setModel("Premimum Sedan");
//		System.out.println(jag.getColor());
//		System.out.println(jag.getPrice());
//		System.out.println(jag.getBrand());
//		System.out.println(jag.getModel());

		Car bmw = new Car("Brown", 850000, "Toyota", null);
	bmw.start();
		bmw.changeGear(1);
	bmw.stop();
//		System.out.println(bmw.hashCode());
//		System.out.println(Integer.toHexString(bmw.hashCode()));
//		System.out.println(bmw);
		/*
		 * 
		 * bmw.setColor("White"); bmw.setPrice(75900000); bmw.setBrand("Abc");
		 * bmw.setModel("djbcjdbj");
		 */
//		System.out.println(bmw.getColor());
//		System.out.println(bmw.getPrice());
//		System.out.println(bmw.getBrand());
//		System.out.println(bmw.getModel());

		/*
		 * jag.color="Black"; jag.price=800000; jag.brand="KIA"; jag.model="Sonet";
		 * System.out.println(jag.color); System.out.println(jag.price);
		 * System.out.println(jag.brand); System.out.println(jag.model);
		 */
		/*
		 * Car bmw=new Car(); bmw.color="white"; bmw.brand="BMW"; bmw.price=4500000;
		 * bmw.model="Luxuary SUV"; System.out.println(bmw.color);
		 * System.out.println(bmw.price); System.out.println(bmw.brand);
		 * System.out.println(bmw.model);
		 * 
		 * bmw=jag;
		 * 
		 */

	}

}
