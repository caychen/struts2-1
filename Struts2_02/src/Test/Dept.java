package Test;

import java.util.ArrayList;
import java.util.List;

public class Dept {
	private String name;
	
	private List<Emp> emps = new ArrayList<Emp>();
	
	public void addEmp(Emp emp){
		emps.add(emp);
		emp.setDept(this);
	}

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmp(List<Emp> emps) {
		this.emps = emps;
	}

	public Dept(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
