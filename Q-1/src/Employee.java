
public class Employee implements Comparable<Employee>{

	//	CLASS VARIABLES
	private String empName;
	private int empId;
	private String empRole;
	
	//NON-PARAMETERISED CONSTRUCTOR
	public Employee()
	{
		this.empName = null;
		this.empId = 0;
		this.empRole = null;
	}

	// PARAMETERISED CONSTRUCTOR WITH  ARGUMENTS
	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empRole = "QA";
	}
	
	// PARAMETERISED CONSTRUCTOR WITH 3 ARGUMENTS
	public Employee(String empName, int empId, String empRole) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empRole = empRole;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empRole=" + empRole + "]";
	}

	//GETTERS AND SETTERS
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	//OVERRIDED METHIOD OF COMPARABLE INTERFACE
	@Override
	public int compareTo(Employee o) {
		if(this.empId > o.empId) return 1;
		if(this.empId < o.empId) return -1;
		else
		return 0;
	}
	
	
}//CLASS END
