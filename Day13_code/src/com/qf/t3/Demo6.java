package com.qf.t3;

public class Demo6 {
	public static void main(String[] args) {
		//4.工具的使用者
		UDisk disk = new UDisk();
		UFan fan = new UFan();
		Mouse mouse = new Mouse();
		
		Computer com = new Computer(mouse,disk,fan);
		
		com.start();
	}
}
//1.接口 /标准
interface Usb{
	void service();//服务   至于服务是供电、还是传输数据      由接口的实现者决定
}
//2.接口的使用者
class Computer{
	Usb usb1;
	Usb usb2;
	Usb usb3;
	
	//接口类型的引用： 传递的是该接口的实现类即可
	public Computer(Usb usb1,Usb usb2,Usb usb3) {
		this.usb1 = usb1;
		this.usb2 = usb2;
		this.usb3 = usb3;
	}
	
	public void start() {
		System.out.println("电脑开机了！ 38个风扇开始亮起");
		usb1.service();
		usb2.service();
		usb3.service();
	}
}
//3.接口的实现者
class UDisk implements Usb{
	@Override
	public void service() {
		System.out.println("传输数据！");
	}
}
class UFan implements Usb{
	@Override
	public void service() {
		System.out.println("供电，风扇呼呼呼的转");
	}
}
class Mouse implements Usb{
	@Override
	public void service() {
		System.out.println("代替了触摸板，移动光标进行点点点");
	}
}