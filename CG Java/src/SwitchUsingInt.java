
public class SwitchUsingInt {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		if(x==1)
		{
			System.out.println("The value of x is 1");
		}
		else if(x==2)
		{
			System.out.println("The value of x is 2");
		}
		else if(y==3)
		{
			System.out.println("The value of x is 3");
		}
		else 
		{
			System.out.println("The value of x is other than 1,2,3");
		}
		switch (y)
		{
		case 1:
			System.out.println("The value of x is 1");
			break;
		case 2:
			System.out.println("The value of x is 2");
			break;
		case 3:
			System.out.println("The value of x is 3");
			break;
		default:
			System.out.println("The value of y is other than 1,2,3");
			break;
		}
	}

}
