package pckg1;

import java.util.ArrayList;

public class EmployeeList{
	
	private ArrayList<Employee> empList;
	
	public EmployeeList(){
		empList = new ArrayList<Employee>();
	}
	
	public void enqueue(Employee emp){
		empList.add(emp);	
	}
	
	public Employee find(String nm){
		for(Employee emp: empList){
			if (emp.name.equals(nm))
				return emp;
		}
		System.out.println("Employee \"" +nm+"\" not found");
		return null;
	}
	
	public void setHours(String nm, double hrs){
		Employee emp = find(nm);
		if (emp!=null){
			emp.setHours(hrs);
		}
	}

	public void setSalary(String nm, double salary) {
		Employee emp = find(nm);
		if (emp!=null){
			emp.setSalary(salary);
		}
	}

	void setSales (String nm, double sales) {
		Employee emp = find(nm);
		if (emp!=null){
			emp.setSales(sales);
		}
	}

	double payroll(){
		double pay=0;
		for (Employee emp: empList){
			pay += emp.computePay();
		}
		return pay;
	}

	void display(){
		for (Employee emp: empList){
			emp.display();
		} 
	}
}