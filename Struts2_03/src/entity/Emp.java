package entity;

public class Emp {
	private String name;
	private Integer salary;
	private String sex;
	private String[] tech;
	public String[] getTech() {
		return tech;
	}
	public void setTech(String[] tech) {
		this.tech = tech;
	}
	private String city;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Emp(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
}
