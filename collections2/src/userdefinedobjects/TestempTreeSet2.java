package userdefinedobjects;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;



public class TestempTreeSet2 {

	public static void main(String[] args) {
		TreeSet<Employee> empSet = new TreeSet<Employee>();
		Employee emp1 = new Employee("John Doe","Male",24,101,"Research",250000);
	
		Employee emp2 = new Employee("Athira","Female",25,102,"Professor",350000);
		
		Employee emp3 = new Employee("Jason Doe","Male",23,103,"Research",40000);
		
		Employee emp4 =new Employee("John Doe","Male",24,101,"Research",250000);
		Employee emp5 =new Employee("John Doe","Male",24,101,"Research",250000);
		
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		
		System.out.println(empSet.size());
		
		
		

	}

}
;