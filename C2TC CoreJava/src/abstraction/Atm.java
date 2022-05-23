package abstraction;
abstract class machine 
{
	abstract void withdraw();
}
public class Atm extends machine {
	void withdraw()
	{
		System.out.println("withdraw successfully");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Atm ob1=new Atm();
ob1.withdraw();
	}
}

