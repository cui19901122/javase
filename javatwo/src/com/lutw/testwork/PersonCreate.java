package com.lutw.testwork;

public class PersonCreate
{

	public static void main(String[] args)
	{
		Person q1=new Person();
		
		q1.sayHello("zhangsan");
		
		q1.name="zhangsan";
		
		q1.height=1.73;
		
		q1.weight=55;
		
		System.out.println("姓名："+q1.name+",身高："+q1.height+",体重："+q1.weight);

		Person q2=new Person();
		
		q2.sayHello("lishi");
		
		q2.name="lishi";
		
		q2.height=1.80;
		
		q2.weight=65;
		
		System.out.println("姓名："+q2.name+",身高："+q2.height+",体重："+q2.weight);
		
		
		
	}
}
