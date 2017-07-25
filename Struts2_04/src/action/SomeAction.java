package action;

public class SomeAction {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String execute(){
		System.out.println(name);
		System.out.println("SomeAction.execute()...");
		return "success";
	}
}
