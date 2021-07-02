package com.qf.t1;

public class Demo1 {
	public static void main(String[] args) {
		//接口与类都不能new对象，     类是有构造方法的。  接口是不允许有构造方法的
		MyClass mc;//父类引用
		MyInterface mi;//接口引用
	}
}
abstract class MyClass{
	String a = "A";//实例属性
	static String b = "B";//静态属性
	static final String C = "C";//静态常量属性
	public static final String D = "D";//公开静态常量属性
	public MyClass() {}
	public void m1() {}//实例方法
	public static  void m2() {}//静态方法
	public abstract void m3();//抽象方法
}
//接口不是类
interface MyInterface{
	//只能定义公开静态常量
	String a = "A";
	static String b = "B";
	static final String C = "C";
	public static final String D = "D";
	
	
	//只能定义公开抽象方法
	void m1();
	
}
