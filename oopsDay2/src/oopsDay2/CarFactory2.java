package oopsDay2;

public class CarFactory2 {

	public static void main(String[] args) {
		//CarIface car = new CarIface(); cannot create object of interface
		//CarIface car; //not refering to any object
		CarIface car=new Car(5000,500,0,false);
		System.out.println(car);
		car.start();
		car.honk();
		car.moove();
		car.stop();
        System.out.println(car);
	}

}
