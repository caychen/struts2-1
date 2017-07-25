package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Foo {
	private String name;
	
	private int value;
	
	private String[] arr = new String[]{"one","two","three"};
	
	private List<String> list = new ArrayList<String>();
	
	private Map<String ,String> map = new HashMap<String,String>();
	
	public Foo(){
		name = "cay";
		value = 10;
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		map.put("@1", "one");
		map.put("@2", "two");
		map.put("@3", "three");
	}
	

	public String[] getArr() {
		return arr;
	}


	public void setArr(String[] arr) {
		this.arr = arr;
	}


	public List<String> getList() {
		return list;
	}


	public void setList(List<String> list) {
		this.list = list;
	}


	public Map<String, String> getMap() {
		return map;
	}


	public void setMap(Map<String, String> map) {
		this.map = map;
	}


	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}
