
public class Stu
{
	// ʵ�����
	String name;

	double menoy;
	// ��̬����
	static String school;

	// ������ʵ��ҵ��
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
		
		s1.name="����";
		
		s1.menoy=1000;
		
		s1.addmenoy();
		
		System.out.println("Ա��"+s1.name+"����"+s1.menoy);
		
	}

}
