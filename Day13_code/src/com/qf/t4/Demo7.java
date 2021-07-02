package com.qf.t4;

import java.util.Arrays;

public class Demo7 {
	public static void main(String[] args) {
		//4.程序员。 工具的使用者
		Student stu1 = new Student("gavin",17,99.5,"男");
		Student stu2 = new Student("tom",25,73.5,"女");
		Student stu3 = new Student("jack",56,88,"男");
		Student stu4 = new Student("marry",18,88.5,"女");
		Student[] stus = {stu1,stu2,stu3,stu4};
		
		//对stus数组  排序。
		//2.工具类
//		Arrays.sort(stus);
		Tools.sort(stus);
		
		
		
		for (int i = 0; i < stus.length; i++) {
			System.out.println(stus[i].age);
		}
	}
}	
//3.接口的实现者
 class Student implements Comparable2<Student>{
	String name;
	int age;
	double score;
	String gender;
	
	@Override
	public int compareTo(Student stu) {
		if(this.age > stu.age) {
			return 1;//大于
		}else if(this.age < stu.age) {
			return -1;//小于
		}
		return 0;//相等
	}
	
	public Student() {
	}
	public Student(String name, int age, double score, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
		this.gender = gender;
	}
	
}
