package com.lutw.testwork;


public class Rectangle
{

    int width;
	
	int length;
	
	double Area;
	
	double Per;
	
	Rectangle(int width,int length)
	{
		this.width=width;
		
		this.length=length;
		
	}
	
	
	public void setArea(int width, int length)
	{
		
		Area=this.width*this.length;   
		
	}
	
	public double getArea()
	{
		return Area;
	}
	
	public void setPer(int width, int length)
	{
		
		Per=(this.width+this.length)*2;

		
	}
	
	public double getPer()
	{
		return Per;
	}
	
	public void showAll()
	{
		System.out.println("��Ϊ��"+width);
		
		System.out.println("��Ϊ��"+length);
		
		System.out.println("�����"+Area);
		
		System.out.println("�ܳ���"+Per);
		
	}
	
	public static void main(String[] args)
	{
		Rectangle q=new Rectangle(5,7);
		q.setArea(q.width, q.length);
		q.setPer(q.width, q.length);
		q.showAll();
	}
}
