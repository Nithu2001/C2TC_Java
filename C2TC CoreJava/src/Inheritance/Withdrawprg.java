package Inheritance;
class Withdraw {
	
	int amt_withdraw=300;
	int amt_left=6000;
    }
  public class Withdrawprg  extends Withdraw
  {
	  int amt_left=6000;
	     public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	 Withdraw ob1=new Withdraw();
	    	  System.out.println("amount withdraw"+ob1.amt_withdraw);
	    	  System.out.println("amount_left"+ob1.amt_left);   	 
	}
  }

