package composition;

public class Employee extends Person {
	private long empId;
	private String deptno;
	private double salary;
	private Address residenceAddress;//has-a
	private Address correspondenceAddress;//has-a
	public Employee()
	{
		
	}
	
	public Address getResidenceAddress() {
		return residenceAddress;
	}

	public void setResidenceAddress(Address residenceAddress) {
		this.residenceAddress = residenceAddress;
	}

	public Address getCorrespondenceAddress() {
		return correspondenceAddress;
	}

	public void setCorrespondenceAddress(Address correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}

	public Employee(String name, String gender, int age,long empId, String deptno, double salary, Address residenceAddress, Address correspondenceAddress) {
		super();
		this.empId = empId;
		this.deptno = deptno;
		this.salary = salary;
		this.residenceAddress = residenceAddress;
		this.correspondenceAddress = correspondenceAddress;
	}

	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/*
	 * @Override public String toString() { return "Employee [empId=" + empId +
	 * ", deptno=" + deptno + ", salary=" + salary + ", getName()=" + getName() +
	 * ", getGender()=" + getGender() + ", getAge()=" + getAge() + "]"; }
	 */ 
	/*
	 * @Override public boolean equals(Object obj) { Employee ref = null;
	 * if(obj!=null) { ref = (Employee)obj; } if(this.empId== ref.getEmpId()
	 * &&this.getName(). equals(ref.getName())&& this.deptno== ref.getDeptno())
	 * return true; else return false; }
	 */
	  @Override
	  public boolean equals(Object obj)
	  {
		  Employee ref=null;
		  if(obj!=null)
			  ref=(Employee)obj;
		  if(this.empId==ref.empId && ref.getName().equals(this.getName())&&
				  ref.getDeptno()==this.deptno) 
		return true;
		  else
		return false;
	  }
	 
	
	/*public int hashCode() {
			int code = this.hashCode() *32*((int)this.empId)*(this.getName().length())*this.deptno.length();
		return super.hashCode();
	}*/
	
	

}
