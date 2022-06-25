
public class operators {

	public static void main(String[] args) {
		int a = 20;
		int b = 15;
		int c = 0;
		boolean x = true;
		boolean y = false;
	c = a+b;
	System.out.println("Addition of a + b is :"+ c);//Arthimetic Operator//
	
	System.out.println("b >=a =" +(b >= a));//Relational Operator//
	
	 System.out.println("x && y = " + (x&&y));//Logical Operator//
	 
	 c = a & b;        
     System.out.println("a & b = " + c );//Bitwise Operator//
     
     c *= a ;
     System.out.println("c *= a = " + c );//Assignment Operator//
     
     ++a;
     System.out.println("Value of a is:"+a);//Unary Operator//
     
     b = (a==1) ? 30: 40;
     System.out.println("Value of b is:"+b);//Conditional Operator//
	}

}
