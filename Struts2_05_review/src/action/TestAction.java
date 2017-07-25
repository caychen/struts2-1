package action;

import dao.FooDAO;
import entity.Emp;

public class TestAction {
	private String name;
	
	private boolean ok;
	
	private Emp emp;
	
	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String execute() throws Exception{
		System.out.println("TestAction.execute()...");
		emp = new Emp();
		emp.setName("Cam");
		emp.setId(1);
		
		if("Cam".equals(name)){
			ok = true;
		}
		
		FooDAO fooDAO = new FooDAO();
		fooDAO.foo();
		return "success";
	}
}
