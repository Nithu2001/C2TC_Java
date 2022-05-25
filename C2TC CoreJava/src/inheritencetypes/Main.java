package inheritencetypes;
 class Super{
	void methodsuper1()
	{
		System.out.println("I AM A PARENT CLASS");
	}
}
	class Subclass extends Super {
		void methodsuper2() {
		System.out.println("I AM A CHILD CLASS");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Subclass sb = new Subclass();
sb.methodsuper1();
sb.methodsuper2();
	}

}
