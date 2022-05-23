package polymorphism;
class Demo
{
	void  add(int a,int b)
	{
		System.out.println("add two numbers :"+(a+b));
	}
	void  add(int a,int b,double c)
	{
		System.out.println("add two numbers :"+(a+b+c));
	}
	}
public class PolymorphismApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Demo obj = new Demo();
		 obj.add(1,3);
		 obj.add(1,3,3.6);
	}

}
