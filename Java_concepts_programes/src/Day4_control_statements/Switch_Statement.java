package Day4_control_statements;

public class Switch_Statement {

	public static void main(String[] args) {
		int weekno=1;
		
		switch(weekno)
		{
		case 1: System.out.println("sunday"); 
		break;
		case 2: System.out.println("Monday"); 
		break;
		case 3: System.out.println("tuesday"); 
		break;
		case 4: System.out.println("Wednesday"); 
		break;
		case 5: System.out.println("saturday"); 
		break;
		default:
		System.out.println("Invalid week number");
		}
	}
}
