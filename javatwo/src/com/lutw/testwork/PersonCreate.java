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
		
		System.out.println("������"+q1.name+",��ߣ�"+q1.height+",���أ�"+q1.weight);

		Person q2=new Person();
		
		q2.sayHello("lishi");
		
		q2.name="lishi";
		
		q2.height=1.80;
		
		q2.weight=65;
		
		System.out.println("������"+q2.name+",��ߣ�"+q2.height+",���أ�"+q2.weight);
		
		
		
	}
}
