package One;

public class HelloAction {
	public HelloAction(){
		System.out.println("HelloAction()...");
	}
	
	public String execute(){
		System.out.println("execute()...");
		return "success";
	}
}