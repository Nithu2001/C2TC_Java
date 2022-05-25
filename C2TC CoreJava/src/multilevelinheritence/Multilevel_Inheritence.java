package multilevelinheritence;



class Nithu{
	void nithu1()
	{
		System.out.println("I AM AN YOUTUBER");
	}
}
	class Kutti extends Nithu{
		void kutti2() {
		System.out.println("I AM AN BUSSINESMAN");
	}
}
	class Bhavani extends Kutti{
		void bhavani3() {
		System.out.println("I AM VERY PATIENCE");
	}
}
public class Multilevel_Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated met
		
		Bhavani b = new Bhavani();
		b.nithu1();
		b.kutti2();
		b.bhavani3();
		
	}

}
