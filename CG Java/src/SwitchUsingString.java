
public class SwitchUsingString {

	public static void main(String[] args) {
		String name  = "org";
		switch(name.toUpperCase())
		{
		case "COLLEGE":
			System.out.println("SVKP");
			break;
		case " COURSE":
			System.out.println("Java Full Stack");
			break;
		case "ORG":
			System.out.println("Capgemini");
			break;
		default:
			System.out.println("Invalid Word");
			break;
		}
		}

}
