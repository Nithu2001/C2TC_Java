package superkeyworld;
class Result{
	int marks =100;
}
class Result2 extends Result{
	int marks =200;
	void displayResults() {
		System.out.println("Marks of the Sudent is :"+super.marks);
	System.out.println("Marks of the Sudent is :"+marks);
	}
}
public class Super_L_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Result2 res = new Result2();
res.displayResults();
	}

}
