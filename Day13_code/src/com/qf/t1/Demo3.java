package com.qf.t1;

public class Demo3 {
	public static void main(String[] args) {
		游戏队伍  郑王队 = new 游戏队伍();
		
		//关注的不是类别， 而是能力。。  多态更自然了。
		郑王队.过河(new 泡沫箱());
		郑王队.过河(new 矿泉水瓶());
		
		郑王队.过河(new 摩托艇());
	}
}
//1.泡沫箱+胶带     王宝强和郑凯  （郑王队）
//2.矿泉水瓶+ 胶带  XX和XX   
class 游戏队伍{
	public void 过河(可漂浮的 可漂浮的) {//关注的是类型，过河的行为，没有船不行
		可漂浮的.漂浮();
	}
}
interface 可漂浮的{
	void 漂浮();
}
class 泡沫箱 implements 可漂浮的{ 
	@Override
	public void 漂浮() {
		System.out.println("将几十个泡沫箱用胶带站在一起，具备了承载漂浮的能力，漂到对岸");
		
	}
}
class 矿泉水瓶 implements 可漂浮的{
	@Override
	public void 漂浮() {
		System.out.println("将几十个矿泉水瓶用胶带站在一起，具备了承载漂浮的能力，漂到对岸");
		
	}
}
class 船 implements 可漂浮的{
	public void 漂浮() {
		
	}
}
class 摩托艇  extends 船 {
	
}
class 游艇 extends 船{
	
}
class 竹筏 extends 船{
	
}