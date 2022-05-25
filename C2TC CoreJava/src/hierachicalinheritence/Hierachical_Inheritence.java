package hierachicalinheritence;



class College{
	void eductional_institute()
	{
		System.out.println("Duty to provide eduction to students");
	}
}
	class Sea extends College{
		void average_eduction1() {
		System.out.println("Sea college is located in Ayappanagar");
	}
}
	class Mvj extends College{
		void average_eduction2() {
		System.out.println("Mvj college is located in Chansandra");
	}
}
    class Cmrit extends College{
		void average_eduction3() {
		System.out.println("Cmrit college is located in Brookfield");
	}
}
public class Hierachical_Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sea s = new Sea();
		Mvj m = new Mvj();
		Cmrit c = new Cmrit();
		c.eductional_institute();
		s.average_eduction1();
		m.average_eduction2();
		c.average_eduction3();
	}

}
