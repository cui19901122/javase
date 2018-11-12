
public class Per
{
	// 类的私有对象
	private String name;

	private int age;

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
	}

}
