
public class Per
{
	// ���˽�ж���
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
			System.out.println("������������д�����������");
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
	
	// ��ǰ��Ķ�������
	//this�����ھ�̬������ʹ��
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
		
		Per p2=new Per();
		p2.name="����";
		p2.age=22;
		p2.showPerInfo();
		
		Per p3=new Per();
		
		//��p2���ڴ��ַ��ֵ��p3����p2��p3����һ�����ڴ�ռ�
		p3=p2;
	}

}
