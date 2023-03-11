package userdefinedobjects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		Employee emp1 = new Employee("John Doe","Male",24,101,"Research",250000);
		
		Employee emp2 = new Employee("Athira","Female",25,102,"Professor",350000);
		
		Employee emp3 = new Employee("Jason Doe","Male",23,103,"Research",40000);
		
		Employee emp4 =new Employee("John Doe","Male",24,101,"Research",250000);
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		HashSet<Employee> empSet = new HashSet<Employee>();
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		
		TreeSet<Employee> empSet1 = new TreeSet<Employee>();
		empSet1.add(emp1);
		empSet1.add(emp2);
		empSet1.add(emp3);
		empSet1.add(emp4);
		
		HashMap<String,Collection> dataMap = new HashMap<>();
		dataMap.put("empList", empList);
		dataMap.put("empSet", empSet);
		dataMap.put("empSet1", empSet1);
		
		System.out.println(dataMap);
	Collection<Employee> list = dataMap.get("empList");
	Iterator<Employee> iter = list.iterator();
	while(iter.hasNext())
	{
		System.out.println(iter.next());
	}
	Collection<Employee> set = dataMap.get("empSet");
	iter = set.iterator();
	while(iter.hasNext())
	{
		System.out.println(iter.next());
	}
	Collection<Employee> tree =dataMap.get("empSet1");
	iter = tree.iterator()
;
	while(iter.hasNext())
	{
		System.out.println(iter.next());
	}
		
				
		
		
	}

}
