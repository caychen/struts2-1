package Test;

import ognl.Ognl;
import ognl.OgnlException;

public class testOgnl {

	public static void main(String[] args) throws OgnlException {
		// TODO Auto-generated method stub
		Foo foo = new Foo();
		
		/**
		 *	1��OGNL���ʽ����ʾҪ���ʶ����ĳ������
		 *	2��Ҫ���ʵĶ���
		 *	3����Ҫ���õ�ֵ 
		 */
		Ognl.setValue("name", foo, "Cay");
		String name = (String) Ognl.getValue("name", foo);
		System.out.println(name);
		
		//���ֳ��õ�ognl���ʽ
		//1)������OGNL
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
