package composition;

public class CompanyHR {

	public static void main(String[] args) {
		Address resAdd=new Address("31","Mannath","Worli","Mumbai",89076);
		Address comAdd=new Address("32","Antela","Bandra","Mumbai",40078);
		
		Employee emp1 = new Employee("John Doe","Male",24,101,"Research",250000,resAdd,comAdd);
		System.out.println(emp1);
		Employee emp2 = new Employee("Athira","Female",25,102,"Professor",350000,resAdd,comAdd);
		System.out.println(emp2);
		Employee emp3 = new Employee("Jason Doe","Male",23,103,"Research",40000,resAdd,comAdd);
		System.out.println(emp3);
		Employee emp4 =new Employee("John Doe","Male",24,101,"Research",250000,resAdd,comAdd);
		Employee emp5 =new Employee("John Doe","Male",24,101,"Research",250000,resAdd,comAdd);
		
		
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
