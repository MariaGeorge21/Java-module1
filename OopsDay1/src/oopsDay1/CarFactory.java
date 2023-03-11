package oopsDay1;

public class CarFactory {

	public static void main(String[] args) {
		Car jag=new Car(); //objection creation
		jag.color="Black";
		jag.price=800000;
		jag.brand="KIA";
		jag.model="Sonet";
		System.out.println(jag.color);
		System.out.println(jag.price);
		System.out.println(jag.brand);
		System.out.println(jag.model);
		
		Car bmw=new Car();
		bmw.color="white";
		bmw.brand="BMW";
		bmw.price=4500000;
		bmw.model="Luxuary SUV";
		System.out.println(bmw.color);
		System.out.println(bmw.price);
		System.out.println(bmw.brand);
		System.out.println(bmw.model);
		
		bmw=jag;
		
		
		
		
		

	}

}
