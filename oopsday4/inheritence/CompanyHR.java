package oopsday4.inheritence;

public class CompanyHR {

	public static void main(String[] args) {
		Employee emp1 = new Employee("John Doe","Male",24,101,"Research",250000);
		System.out.println(emp1);
		Employee emp2 = new Employee("Athira","Female",25,102,"Professor",350000);
		System.out.println(emp2);
		Employee emp3 = new Employee("Jason Doe","Male",23,103,"Research",40000);
		System.out.println(emp3);
		Employee emp4 =new Employee("John Doe","Male",24,101,"Research",250000);
		Employee emp5 =new Employee("John Doe","Male",24,101,"Research",250000);
		
		
        if(emp1.equals(emp4))
        	
        {
        	System.out.println("objects are same");
        }
        else
        {
        	System.out.println("the objects are not same");
        }
	}

}
