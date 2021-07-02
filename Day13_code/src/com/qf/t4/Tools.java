package com.qf.t4;

//2.工具类  
public class Tools {
	//工具类只负责排序， 不负责规则
	public static void sort(Student[] stus) {
		
		for (int i = 0; i < stus.length - 1; i++) {
			for (int j = 0; j < stus.length - 1 - i; j++) {
				Comparable2 com = (Comparable2)stus[j];//让要排序的数组中的每个对象要遵循比较的标准
				
				int result = com.compareTo(stus[j + 1]);// 正  负  0
				
				//是根据比较后的结果，判断是否要交换位置    (升序)
				if(result > 0) {
					Student stu = stus[j];
					stus[j] = stus[j + 1];
					stus[j+1] = stu;
				}
			}
		}
	}
	
	
}
