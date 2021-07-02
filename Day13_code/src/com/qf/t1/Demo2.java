package com.qf.t1;

public class Demo2 {
	public static void main(String[] args) {
		//可以访问Dog自身的所具备的所有属性和方法。
		Dog dog = new Dog();
		
		
		//父类引用指向子类对象，可以访问动物类型所具备的属性和方法。
		Animal a = dog;//关注的是类型
		
		//关注具体的行为。 只能看到接口赋予类的方法
		Runnable runer = dog;//更自然的使用多态
		runer.run();
		
		if(runer instanceof Dog) {
			Dog myDog = (Dog)runer;
			System.out.println(myDog.gender);
		}
	}
}
class Animal{
	String breed;
	int age;
	String gender;
	
	public void eat() {}
	public void sleep() {}
}
//						   实现->附加         ,分割多个接口
class Dog extends Animal implements Runnable,Swimmable{
	//站在独有的能力角度来说，父类提供的共性方法的种类无法满足子类需求。   而子类还需要一些额外的特殊的能力
	public void run() {
		System.out.println("狗狗在奔跑");
	}
	public void play() {}
	public void swim() {}
}
class Cat extends Animal  implements Runnable,Climbable{
	public void run() {
		System.out.println("猫猫在奔跑");
	}
	public void play() {}
	public void climb() {}
}
class Fish extends Animal{
	public void swim() {}
}
class Snake extends Animal{
	public void climb() {}
}

class Bus implements Runnable{

	@Override
	public void run() {
		System.out.println("公交车在行驶");
	}
	
}