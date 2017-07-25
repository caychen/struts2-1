package action;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import entity.Emp;

public class ShowAction {
	private Emp emp;
	
	private Map<String, String> sexOptions;
	private Map<String, String> TechOptions;
	public Map<String, String> getTechOptions() {
		return TechOptions;
	}

	public void setTechOptions(Map<String, String> techOptions) {
		TechOptions = techOptions;
	}

	private Map<String, String> cities;


	public Map<String, String> getCities() {
		return cities;
	}

	public void setCities(Map<String, String> cities) {
		this.cities = cities;
	}
	
	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public String execute(){
		emp = new Emp("Goodman", 10000);
		emp.setSex("f");
		emp.setTech(new String[]{"C++","Python"});
		emp.setCity("sh");
		
		//HashMap内部会自动排序，LinkedHashMap会与put的顺序相同
		sexOptions = new LinkedHashMap<String, String>();
		sexOptions.put("m", "Male");
		sexOptions.put("f", "Female");
		
		TechOptions = new HashMap<String, String>();
		TechOptions.put("Java", "Java");
		TechOptions.put("C++", "C++");
		TechOptions.put("Python", "Python");
		TechOptions.put("PHP", "PHP");
		
		cities = new LinkedHashMap<String, String>();
		cities.put("bj", "北京");
		cities.put("sh", "上海");
		cities.put("sz", "苏州");
		cities.put("nj", "南京");
		return "success";
	}

	public Map<String, String> getSexOptions() {
		return sexOptions;
	}

	public void setSexOptions(Map<String, String> sexOptions) {
		this.sexOptions = sexOptions;
	}
}
