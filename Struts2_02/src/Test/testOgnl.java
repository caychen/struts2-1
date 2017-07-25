package Test;

import ognl.Ognl;
import ognl.OgnlException;

public class testOgnl {

	public static void main(String[] args) throws OgnlException {
		// TODO Auto-generated method stub
		Foo foo = new Foo();
		
		/**
		 *	1、OGNL表达式，表示要访问对象的某个属性
		 *	2、要访问的对象
		 *	3、需要设置的值 
		 */
		Ognl.setValue("name", foo, "Cay");
		String name = (String) Ognl.getValue("name", foo);
		System.out.println(name);
		
		//各种常用的ognl表达式
		//1)基本的OGNL
		Foo root = new Foo();
		Ognl.getValue("name", root);
		
		Ognl.getValue("value", root);
		
		System.out.println(Ognl.getValue("arr[1]", root));
		
		System.out.println(Ognl.getValue("list[2]", root));
		
		System.out.println(Ognl.getValue("map['@2']", root));
		
		//2)
		Dept dept = new Dept("R&D");
		Emp emp1 = new Emp("Name1", 1000);
		Emp emp2 = new Emp("Name2", 2000);
		Emp emp3 = new Emp("Name3", 3000);
		dept.addEmp(emp1);
		dept.addEmp(emp2);
		dept.addEmp(emp3);
		
		System.out.println(Ognl.getValue("dept.name", emp1));
		
		System.out.println(Ognl.getValue("emps[2].salary", dept));
		
		System.out.println(Ognl.getValue("emps[1].salary + 3000", dept));
	}

}
