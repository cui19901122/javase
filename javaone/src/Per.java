
public class Per
{
	// ���˽�ж���
	private String name;

	private int age;

	public void showPerInfo()
	{
		System.out.println(this.name+",����:"+this.age);

	}

	public static void main(String[] agrs)
	{
		Per p1=new Per();
		p1.name="����";
		p1.age=20;
		p1.showPerInfo();
	}

}
