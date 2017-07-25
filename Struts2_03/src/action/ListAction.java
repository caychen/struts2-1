package action;

import java.util.ArrayList;
import java.util.List;

import entity.Emp;

public class ListAction {
	private List<String> nameList;
	private List<Emp> empList;
	
	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	public String execute(){
		nameList = new ArrayList<String>();
		nameList.add("ABC");
		nameList.add("BCD");
		nameList.add("CDE");
		
		empList = new ArrayList<Emp>();
		empList.add(new Emp("AAA", 10000));
		empList.add(new Emp("BBB", 10000));
		empList.add(new Emp("CCC", 10000));
		return "success";
	}

	public List<Emp> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Emp> empList) {
		this.empList = empList;
	}
}
