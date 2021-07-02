package com.qf.t2;

public class Demo5 {
	public static void main(String[] args) {
		//做项目时，将固定的多个值，都会封装在类里或接口里， 变成公开静态常量。
		int orderStatus = StatusNumbers.UNPAID;
		if(orderStatus == StatusNumbers.UNPAID) {
			System.out.println(Status.UNPAID);
		}else if(orderStatus == StatusNumbers.PAY_NO_SEND) {
			System.out.println(Status.PAY_NO_SEND);
		}
	}
}
interface Status{//用于前端用户显示的
	//待支付、已支付待发货、已发货、签收、订单完成
	String UNPAID = "待支付";
	String PAY_NO_SEND = "已支付待发货";
	String SEND_OUT = "已发货";
	String GET_IT = "签收";
	String ORDER_OVER = "订单完成";
}
//0、1、2、3、4
interface StatusNumbers{//用于后端做判断用的
	int UNPAID = 0;
	int PAY_NO_SEND =1;
	int SEND_OUT = 2;
	int GET_IT = 3;
	int ORDER_OVER = 4;
}
