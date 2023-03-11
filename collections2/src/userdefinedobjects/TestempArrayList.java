package userdefinedobjects;
import java.util.ArrayList;
import java.util.Iterator;



public class TestempArrayList {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee("John Doe","Male",24,101,"Research",250000);
	
		Employee emp2 = new Employee("Athira","Female",25,102,"Professor",350000);
		
		Employee emp3 = new Employee("Jason Doe","Male",23,103,"Research",40000);
		
		Employee emp4 =new Employee("John Doe","Male",24,101,"Research",250000);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		System.out.println(empList);
		
		
		

	}

}
;