package com.qf.t4;

import java.util.Arrays;

public class Demo8 {
	public static void main(String[] args) {
		//4.工具
		Teacher[] ts = {new Teacher("aaa",3500),new Teacher("bbb",3200),new Teacher("ccc",6500),new Teacher("ddd",120)};
		
		//Comparable  1997写好的接口   实现这个接口，就可以自定义比较的规则  比较的标准
		Arrays.sort(ts);
		
		
		for (int i = 0; i < ts.length; i++) {
			System.out.println(ts[i].salary);
		}
	}
}
//3.接口的实现者
class Teacher implements Comparable<Teacher>{
	String name;
	double salary;
	
	@Override
	public int compareTo(Teacher o) {
		if(this.salary > o.salary) {
			return 1;
		}else if(this.salary < o.salary){
			return -1;
		}
		return 0;
	}
	public Teacher() {
	}
	public Teacher(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
}