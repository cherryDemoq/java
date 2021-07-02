package com.qf.t2;

public class Demo4 {
	public static void main(String[] args) {
		//Java是单继承还是多继承？
		//Java当中的类是单继承，接口与接口是多继承。
	}
}
interface InterA{
	void m1();
}

interface InterB{
	void m2();
}

interface InterC extends InterB,InterA{
	void m3();
}

class MyClass implements InterC{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	
}