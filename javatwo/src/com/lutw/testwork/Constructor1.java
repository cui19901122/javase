package com.lutw.testwork;

public class Constructor1 extends Person1
{
	
	Constructor1(String name, double height, double weight)
	{
		super("null",0,0);
		
	}
	
	public static void main(String[] args)
	{
		Constructor1 p=new Constructor1("zhangsan",1.73,55);
		p.sayHello("zhangsan");

		Constructor1 p1=new Constructor1("lishi",1.80,65);
		p1.sayHello("lishi");
	}

}
