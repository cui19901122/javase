
public class Per
{
	// 类的私有对象
	private String name;

	private int age;
	
	public void setAge(int age)
	{
		if(age>0 && age<=100)
		{
			this.age=age;
		}
		else 
		{
			System.out.println("你输入的年龄有错，请重新输入");
		}
	}
	
	public int getAge()
	{
		if(age>0 && age<=100)
		{
			return this.age;
		}
		else 
		{
			return 0;
		}
	}
	
	// 当前类的对象的输出
	//this不能在静态对象中使用
	public void showPerInfo()
	{
		System.out.println(this.name+",年龄:"+this.age);

	}

	
	public static void main(String[] agrs)
	{
		Per p1=new Per();
		p1.name="莉莉";
		p1.age=20;
		p1.showPerInfo();
		
		Per p2=new Per();
		p2.name="李明";
		p2.age=22;
		p2.showPerInfo();
		
		Per p3=new Per();
		
		//将p2的内存地址赋值给p3，及p2、p3共用一个堆内存空间
		p3=p2;
	}

}
