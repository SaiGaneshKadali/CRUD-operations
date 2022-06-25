
public class SwitchStmnt {
	public static void main(String args[]) {
		int months = 5;
		String monthname;
		switch (months) {
		case 1:
		monthname = "JAN";
		break;
		case 2:
		monthname = "FEB";
		break;
		case 3:
		monthname= "MAR";
		break;
		case 4:
		monthname= "APR";
		break;
		case 5:
		monthname = "MAY";
		break;
		case 6:
		monthname = "JUNE";
		break;
		case 7:
		monthname = "JULY";
		break;
		default:
		monthname = "Invalid";
		break;
		}
		System.out.println(monthname);
		}
		
	}


