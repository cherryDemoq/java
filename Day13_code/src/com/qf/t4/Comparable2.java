package com.qf.t4;
//1.接口 标准
//2.只要实现了该接口，就具备了比较的行为，才能进行排序。
public interface Comparable2<T> {//T 代表任意类型，具体是什么类型  ，调用者决定
	
	/**
	 * 比较的方法
	 * 比较的规则和过程，由实现者决定。  （比年龄、比成绩）
	 * this调用了该方法，和自身同类型的另一个对象比较
	 * @param t 另一个传入要进行比较的对象
	 * @return 标准  正整数   负整数  0
	 * 正整数： this和stu,this靠后，stu靠前
	 * 负整数：this和stu，this靠前，stu靠后
	 * 0 ： this和stu相等，不用交换。
	 */
	int compareTo(T stu);
}
