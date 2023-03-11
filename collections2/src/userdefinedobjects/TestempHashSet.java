package userdefinedobjects;

import java.util.HashSet;
import java.util.Iterator;





public class TestempHashSet {

	public static void main(String[] args) {
		HashSet<Employee> empSet = new HashSet<Employee>();
		Employee emp1 = new Employee("John Doe","Male",24,101,"Research",250000);
	
		Employee emp2 = new Employee("Athira","Female",25,102,"Professor",350000);
		
		Employee emp3 = new Employee("Athira","Female",25,102,"Professor",350000);
		
		
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		//empSet.add(emp4);
		
		
		System.out.println(empSet);
		System.out.println(empSet.size());
		
		
		

	}

}
;