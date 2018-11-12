
public class Stu
{
	// 实类对象
	String name;

	double menoy;
	// 静态对象
	static String school;

	// 方法，实现业务
	void addmenoy()
	{
		int addmenoy=300;
		System.out.println(addmenoy);
		
		menoy=menoy+addmenoy;
		System.out.println(menoy);

	}
	
	public static void main(String[] args)
	{
		Stu s1=new Stu();
		
		s1.name="莉莉";
		
		s1.menoy=1000;
		
		s1.addmenoy();
		
		System.out.println("员工"+s1.name+"补贴"+s1.menoy);
		
	}

}
