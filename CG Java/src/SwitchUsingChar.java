
public class SwitchUsingChar {

	public static void main(String[] args) {
		char x = 'B';
		switch(x)
		{
		case 'a':
		case 'A':
			System.out.println("The value of x is A");
			break;
		case 'b':
		case 'B':
			System.out.println("The value of x is B");
			break;
		case 'c':
		case 'C':
			System.out.println("The value of x is C");
			break;
		default:
			System.out.println("The value of x is other than a,b,c");
			break;
			
		}
	}

}
