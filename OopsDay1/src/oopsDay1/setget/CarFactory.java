package oopsDay1.setget;

public class CarFactory {

	public static void main(String[] args) {
		Car jag=new Car(); //objection creation
		jag.setColor("Red");
		jag.setPrice(3000000);
		jag.setBrand("Jagur");
		jag.setModel("Premimum Sedan");
		System.out.println(jag.getColor());
		System.out.println(jag.getPrice());
		System.out.println(jag.getBrand());
		System.out.println(jag.getModel());
		
	Car bmw= new Car();
	bmw.setColor("White");
	bmw.setPrice(75900000);
	bmw.setBrand("Abc");
	bmw.setModel("djbcjdbj");
	System.out.println(bmw.getColor());
	System.out.println(bmw.getPrice());
	System.out.println(bmw.getBrand());
	System.out.println(bmw.getModel());
	
		
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
